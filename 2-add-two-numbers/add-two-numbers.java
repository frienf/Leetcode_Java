class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(1); 
        ListNode current = dummy; 
        int carry = 0;  
        while (l1 != null || l2 != null || carry != 0) {     
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;  
            int sum = x + y + carry;
            carry = sum / 10; 
            int digit = sum % 10;         
            current.next = new ListNode(digit);
            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next; 
    }
}