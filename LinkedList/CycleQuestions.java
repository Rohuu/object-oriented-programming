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

    // happy number
    // https://leetcode.com/problems/happy-number/

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }
        while (slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }

    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans=ans+rem*rem;
            number=number/10;
        }
        return ans;
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
