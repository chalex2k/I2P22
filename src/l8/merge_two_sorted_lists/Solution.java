package l8.merge_two_sorted_lists;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode node1 = list1;
        ListNode node2 = list2;
        if (node1.val > node2.val){
            head = node2;
            node2 = node2.next;
        }
        else{
            head = node1;
            node1 = node1.next;
        }
        ListNode node = head;

        while (node1 != null || node2 != null) {
            if (node1 == null){
                node.next = node2;
            }
            else if (node2 == null){
                node.next = node1;
            }
            else if (node1.val > node2.val){
                node = node2;
                node2 = node2.next;
            }
            else{
                node = node1;
                node1 = node1.next;
            }
            node = node.next;
        }

        return head;

    }


}