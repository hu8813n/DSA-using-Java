package Linked_List;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertFirst(3);
        list.insertFirst(3);
//        list.display();

//       list.insertLast(3);
       list.insertLast(5);
       list.insert(10 , 3);
        list.insertLast(3);
        list.insertLast(3);
//       list.display();
//       list.size();

//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(3));
        list.insertRec(20 , 4);
//       list.insert(3, 4);
//       list.insert(10 , 5);
       // list.bubbleSort();
        list.display();
//        list.reverse();
        list.deleteAll(3);
        list.display();
//       list.size();
//        System.out.println(list.find(10));

    }


}
