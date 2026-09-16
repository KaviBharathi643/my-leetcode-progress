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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode join=new ListNode(0);
        ListNode cur=join;
        while(list2!=null && list1!=null){
            
            if(list2.val>=list1.val){
                join.next=list1;
                list1=list1.next;
            }
            else{
                join.next=list2;
                list2=list2.next;
            }
            join=join.next;
        }
        while(list1!=null){
            join.next=list1;
            join=join.next;
            list1=list1.next;
        }
        while(list2!=null){
            join.next=list2;
            join=join.next;
            list2=list2.next;
        }
        return cur.next;
    }
}