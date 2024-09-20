package Linked_List;

public class MainDLL {
    public static void main(String[] args) {
        DLL ll = new DLL();

        ll.insertFirst(15);
        ll.insertFirst(14);
        ll.insertFirst(11);
        ll.insertFirst(8);
        ll.insertFirst(6);
        ll.insertFirst(1);
        ll.insertLast(19);
        ll.insert(7, 2);
        ll.display();
        ll.displayRev();
    }
}
