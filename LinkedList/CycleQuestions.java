package LinkedList;

import java.util.List;

public class CycleQuestions {

    // check whether linked list has cycle in it or not
    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Find length of cycle in a Linked List
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next.next;
            if (slow == fast) {
                // cycle found, now calculate length
                ListNode temp=slow.next;
                int length=1;
                while(temp!=fast){
                    temp=temp.next;
                    length=length+1;
                }
                return length;
            }
        }
        return 0;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }
}
