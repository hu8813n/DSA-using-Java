package StackandQueue;



public class Queue {
    //this is linked list implemntation of queue

    private Node head;
    private Node tail;
    private int size;

    public void insert(int value){

        Node node = new Node(value);
        if(size == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }
    public int get(){
        return head.value;
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
