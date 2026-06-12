class nthNodeFromEnd{
    public static class Node{
        int val;
        Node next; // The address has the same datatype as node, it basically has the complete node
        Node(int val){
            this.val = val;
        }
    }

    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        //nth node from end = mth node from start
        int m = size - n + 1;
        temp = head;
        for(int i=0;i<m-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNodeUsingSlowAndFast(Node head, int n){
        Node fast = head, slow = head;
        for(int i=0;i<n;i++) fast = fast.next;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    /*
        How does the 2 pointer approach work?
        Suppose the total length to be L. We need to find nth node that means we need to move L - n steps;
        Move the fast pointer n steps ahead, then you only need to cover L-n steps and moving slow and fast 
        imultaneously takes you to the nth node from the last. 
     */

    public static Node removeNthNodeFromLast(Node head, int n){
        Node slow = head, fast = head;
        for(int i=0;i<n;i++) return fast = fast.next;

        //edge case: deleting the head node (the fast will be null after the upper for loop)
        if(fast == null) head = head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    /*
        Same fast and slow pointer approach, just dont take the fast to the null, stop it at the tail node.
        Now the slow pointer is just behind the node to be deleted.
        slow.next = slow.next.next;
     */

    public static void main(String[] args){
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(43);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        
        Node temp = nthNode(a,3);
        System.out.println(temp.val);
        temp = nthNodeUsingSlowAndFast(a, 3);
        System.out.println(temp.val);
    }
}