package Assignment_03_LLDelete;


public class Main {
    public static void main(String[] args) {
        SingleLinkedListTest sll = new SingleLinkedListTest();
        sll.insertLinkedList(1,0);
        sll.insertLinkedList(2,1);
        sll.insertLinkedList(3,2);
        sll.insertLinkedList(4,3);
        sll.deleteNode(4);
        sll.traverseLinkedList();
        sll.searchNode(5);

    }
}
