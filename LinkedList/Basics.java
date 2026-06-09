class Basics{
    public static class Node{
        int val;
        Node next; // The address has the same datatype as node, it basically has the complete node
        Node(int val){
            this.val = val;
        }
    }

    public static void recIteration(Node head){
        if(head == null) return;
        System.out.print(head.val + " ");
        recIteration(head.next);
    }

    public static void revIteration(Node head){
        if(head == null) return;
        revIteration(head.next);
        System.out.print(head.val + " ");
    }

    public static int length(Node a){
        int count = 0;
        Node temp = a;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // To Iterate
        Node temp = a;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        // recursive iterfation
        recIteration(a);

        // To print in reverse
        revIteration(a);

        // To find length
        int len = length(a);
        System.out.println(len);
        
    }
}