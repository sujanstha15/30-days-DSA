public class MergeLinkedList {
    
//final code
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
        //a dummy node
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;

        //traversing and comparing in both list
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
            
        }

        //if one of the list is longer just add them in the list
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next= list2;
        }
        return dummyNode.next;
}}
}
