package Linked_List;

public class DLL {
    private Node head;
    private Node tail;

    private int size;


    public DLL(){
        this.size = 0;
    }


    public void insertFirst(int value){
        Node newNode = new Node(value);

//        if(size == 0){
//            newNode.value = value;
//            head = newNode;
//            size = size +1;
//        }
            newNode.value = value;
           // head.prev = newNode;
          newNode.next = head;
          head = newNode;
//          newNode.next.prev = head;

          if(tail == null){
              tail = head;
          }else{
              newNode.next.prev = head;
          }
          size++;
    }


    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
        }
        if(index == size){
            insertLast(value);
        }else{

            Node temp = head;
            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            Node node = new Node(value);
            temp.next.prev = node;
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            size++;
        }
    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
        }else {

            Node newNode = new Node(value);
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            newNode.value = value;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
//            last = newNode;
            size++;
            // only for updating tail because i used tail in displayRev()
            tail = newNode;
        }
    }


    public void displayRev(){
        Node node = tail;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println("END");
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        //print in reverse without tail
//        while(last!=null){
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.println("END");
    }




    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next , Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
