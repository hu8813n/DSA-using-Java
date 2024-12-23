package Linked_List;



public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public Node getHead(){
        return head;
    }

    public Node find(int value){
    Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }


    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void insertRec(int val, int index ){
        head = insertRec(val, index , head);
    }

    private Node insertRec(int val, int index , Node node ){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }

        node.next = insertRec(val , --index, node.next) ;
        return node;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }


    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }else{
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }


    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }


    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }


    public int deleteLast(){
        Node secondLast =  get(size-2);
        int val = tail.value;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void size(){
        System.out.println(size);
    }


    public void bubbleSort(){
        bubbleSort(size-1, 0);
        }

    private void bubbleSort(int row , int col){

        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node sec = get(col+1);
            if(first.value > sec.value){
                if(first == head){
                    first.next = sec.next;
                    sec.next = first;
                    head = sec;
                } else if (sec == tail) {
                    Node prev = get(size-3);
                    prev.next = sec;
                    tail = first;
                    sec.next = tail;
                    tail.next = null;
                }else{
                    Node prev = get(col - 1);
                    prev.next = sec;
                    first.next = sec.next;
                    sec.next = first;

                }
            }
            bubbleSort(row , col+1);
        }else{
            bubbleSort(row-1 , 0);
        }



    }


// Recursion Reverse

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void reverse(){
        if(size < 2){
            return ;
        }else{
            Node prev = null;
            Node present = head;
            Node next1 = present.next;
            while(present != null){
                present.next = prev;
                prev = present;
                present = next1;
                if(present != null){
                    next1 = next1.next;
                }

            }
            head = prev;

        }
    }


    //Delete all values
    public void deleteAll(int val){
        while(head!= null && head.value == val){
            head = head.next;
        }
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next!= null){
            if(current.next.value == val){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }

    }

    // keep one and delte other duplicates must be sorted


    public  void deleteDuplicates(){
        Node current = head;
        while(current != null && current.next != null){
            if(current.value == current.next.value){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }







    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
