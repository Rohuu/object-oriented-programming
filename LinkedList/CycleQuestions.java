package LinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    // https://leetcode.com/problems/linked-list-cycle-ii/submissions/931731381/
    public ListNode detectCycle(ListNode head) {
        // this solution has a space complexity as we are using a hashSet here

        Set set = new HashSet();
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode node = head;
                while (node != null) {
                    if (set.add(node)) {
                        node = node.next;
                    } else {
                        return node;
                    }
                }
            }
        }
        return null;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/submissions/931731381/
    public ListNode detectCycleWithoutUsingSpace(ListNode head) {
        // without using any new space

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast=head;
                while(fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    // middle of the linkedList
    // https://leetcode.com/problems/middle-of-the-linked-list/submissions/931792214/
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    // reverse a linkedList
    // https://leetcode.com/problems/reverse-linked-list/description/
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode middle=middleNode(head);   // calculate middle
        ListNode headSecond=reverseList(middle);  // reverse the other half of the list

        while(head!=null && headSecond!=null){   // then iterate and check values
            if(head.val!=headSecond.val){
                return false;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        return true;
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
