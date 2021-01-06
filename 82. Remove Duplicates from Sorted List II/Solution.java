class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        printList(head);
        ListNode temp = head.next;
        int prevVal = head.val;
        int position = 0;
        while (temp != null) {
            if (temp.val == prevVal) {
                System.out.println("Duplicate Detected For Val: " + temp.val + " at position: " + position);
            }
            prevVal = temp.val;
            temp = temp.next;
            position++;
        }
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}