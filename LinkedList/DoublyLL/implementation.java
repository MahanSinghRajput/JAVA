class implementation {
    static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }

    public static void diplayUsingRandomNode(Node node) {
        if (node == null) return;
        Node temp = node;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int length(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // Insertions
    public static Node insertAtHead(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) return temp;
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static Node insertAtTail(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) return temp;
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = temp;
        temp.prev = t;
        return head;
    }

    public static Node insertAtIndex(Node head, int val, int index) {
        int len = length(head);
        if (index < 0 || index > len) throw new IndexOutOfBoundsException("Invalid Index");

        if (index == 0) {
            return insertAtHead(head, val);
        } else if (index == len) { // Fixed: Inserting at index 'len' is correct for tail append
            return insertAtTail(head, val);
        }

        Node temp = new Node(val);
        Node t = head;
        for (int i = 0; i < index - 1; i++) t = t.next;
        
        Node nextNode = t.next; 
        temp.next = nextNode;   
        temp.prev = t;          
        t.next = temp;          
        if (nextNode != null) nextNode.prev = temp;   
        return head;
    }

    // Deletions
    public static Node deleteHead(Node head) {
        if (head == null) return null;
        if (head.next == null) return null; // Safe for 1-node lists
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.prev.next = null;
        return head;
    }

    public static Node deleteAtIndex(Node head, int index) {
        int len = length(head);
        if (index < 0 || index >= len) throw new IndexOutOfBoundsException("Invalid Index");

        if (index == 0) return deleteHead(head);
        else if (index == len - 1) return deleteTail(head); // Correct for deletion
        
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        
        Node nextNode = temp.next.next;
        temp.next = nextNode;
        if (nextNode != null) nextNode.prev = temp; // Fixed: Added safety check to prevent NPE
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.prev = d; d.prev = c; c.prev = b; b.prev = a;

        diplayUsingRandomNode(c);

        a = insertAtTail(a, 6);
        a = insertAtHead(a, 0);
        a = insertAtIndex(a, 23, 1);
        a = deleteAtIndex(a, 1);
        diplayUsingRandomNode(a);
    }
}