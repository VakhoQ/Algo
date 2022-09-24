package algo.leetcode;

public class MergeTwiSirtedKust21 {


    public static void main(String[] args) {


    }

    public ListNode mergeTwoListsIteration(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail= tail.next;
        }
        tail.next= l1==null? l2 : l1;

        return head.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head;

        if      (l1==null){ return l2;   }
        else if (l2==null){   return l1; }

        if(l1.val < l2.val){
            head=l1;
            l1=l1.next;
        }else{
            head = l2;
            l2=l2.next;
        }

        head.next= mergeTwoLists(l1,l2);

        return head;
    }
    public  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


}
