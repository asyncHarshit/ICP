package assignment9;

public class remove_duplicate {
     

  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode first = head;
        ListNode second = first.next;
        while(second!=null){
            if(first.val==second.val){
                second = second.next;
            }
            else{
                first.next = second;
                first = second;
                second = second.next;
            }
        }
        first.next = null;
        return head;
        
    }
}
}
    

