package UndoRedoManager;

public class UndoRedoTest {
    public static void main(String[] args) {
        UndoRedoManager<Integer> undoRedoManager = new UndoRedoManager<>(1);
        System.out.println(undoRedoManager.getCurrentValue());

        undoRedoManager.addValue(2);
        undoRedoManager.addValue(3);
        undoRedoManager.traverse(); // 1 -> 2 -> 3

        undoRedoManager.undo();
        undoRedoManager.undo();
        undoRedoManager.addValue(4);
        undoRedoManager.traverse(); // 1 -> 4

        undoRedoManager.redo(); // Cannot redo
        undoRedoManager.addValue(5);
        undoRedoManager.traverse(); // 1 -> 5

        undoRedoManager.undo();
        undoRedoManager.addValue(6);
        undoRedoManager.traverse();
    }
}
