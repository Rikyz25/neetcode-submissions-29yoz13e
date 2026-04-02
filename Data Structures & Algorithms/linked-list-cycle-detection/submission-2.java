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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        if (temp==null) return false;
        Map<Integer,Integer> mp=new HashMap<>();
        while(temp.next!=null){
            if(mp.containsKey(temp.val)) return true;
            mp.put(temp.val,0);
            temp=temp.next;

        }
        return false;
    }
}

