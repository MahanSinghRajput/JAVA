class reverseLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        if(head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    /*
        Steps to reverse a LL:
        1. head.next ko rev kar do
        2. head, head.next ko interchange kardo
            head.next.next = head
        3. return the new head 
    */
    public static Node reverseRecursion(Node head){
        if(head.next == null) return head;
        Node newHead = reverseRecursion(head.next);
        head.next.next = head; // interchanging connections
        head.next = null;
        return newHead;
    }

    // without recursion
    // 3 pointer approach
    /*
        Use 3 pointers prev, curr, agla
        1. agla = curr.next
        2. curr.next = prev
        3. prev = curr
        4. curr = agla
     */
    public static Node reverse(Node node){
        Node prev = null, agla = node, curr = node;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    public static void main(String[] args){
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        display(a);

        Node rev = reverse(a);

        display(rev);
    }
}