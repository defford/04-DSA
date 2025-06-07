package UndoRedoManager;

public class UndoRedoManager<T> {
    private Node<T> head;
    private Node<T> current;

    public UndoRedoManager(T initialValue) {
        Node<T> node = new Node<>(initialValue);
        this.head = node;
        this.current = node;
    }

    public T getCurrentValue() {
        return current.getValue();
    }

    public void addValue(T value) {
        Node<T> node = new Node<>(value);
        current.setNext(node);
        node.setPrev(current);
        current = node;
    }

    public void undo() {
        if (current.getPrev() != null) {
            current = current.getPrev();
        } else {
            System.out.println("Cannot undo");
        }
    }

    public void redo() {
        if (current.getNext() != null) {
            current = current.getNext();
        } else {
            System.out.println("Cannot redo");
        }
    }

    public void traverse() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getValue());
            if (node.getNext() != null) {
                System.out.print(" -> ");
            }
            node = node.getNext();
        }
        System.out.println();
    }
}
