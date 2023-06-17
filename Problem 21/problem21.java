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
class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    
        ListNode temp_node_initial = new ListNode(0);
        ListNode temp_node = temp_node_initial;

        while(l1 != null && l2 != null) {

            if(l1.val <= l2.val) {
                temp_node.next = l1;
                l1 = l1.next;
            } else {
                temp_node.next = l2;
                l2 = l2.next;
            }

            temp_node = temp_node.next;

        }


        if(l1!=null){
            temp_node.next = l1;
            l1 = l1.next;
        }
        if (l2!= null)
        {
            temp_node.next = l2;
            l2 = l2.next;
        }

        return temp_node_initial.next;
    }
}