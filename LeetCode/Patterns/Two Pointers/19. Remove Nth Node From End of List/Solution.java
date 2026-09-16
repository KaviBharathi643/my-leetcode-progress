/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        if(temp.next==null){
            return null;
        }
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int k=c-n;
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}