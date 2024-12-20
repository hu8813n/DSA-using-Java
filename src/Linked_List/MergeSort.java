package Linked_List;

public class MergeSort {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left , right);
    }



    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode list = new ListNode();
        ListNode head = list;

        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                ListNode node = new ListNode(h1.val);
                head.next = node;
                head = node;
                h1 = h1.next;

            }else{
                ListNode node = new ListNode(h2.val);
                head.next = node;
                head = node;
                h2 = h2.next;
            }
        }
        if(h1 == null){
            while(h2 != null){
                ListNode node = new ListNode(h2.val);
                head.next = node;
                head = node;
                h2 = h2.next;
            }
        }
        if(h2 == null){
            while(h1 != null){
                ListNode node = new ListNode(h1.val);
                head.next = node;
                head = node;
                h1 = h1.next;

            }
        }
        ;
        return list.next;
    }


    public ListNode getMid(ListNode head) {
        return null;
    }
}
