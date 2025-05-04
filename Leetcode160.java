public class Leetcode160 {
    public static void main(String[] args) {
        // Predefined input for testing
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, common));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

        Leetcode160 solution = new Leetcode160();
        ListNode intersection = solution.getIntersectionNode(headA, headB);
        System.out.println(intersection != null ? intersection.val : "No intersection");
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA, b = headB;

        while (a != b) {
            // Move to the next node or switch lists if at the end
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a; // Either the intersection node or null
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}
