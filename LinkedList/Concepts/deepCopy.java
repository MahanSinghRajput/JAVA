class deepCopy {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
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

        Node temp = new Node(-1);
        Node h = temp;
        Node t = a;
        while(t != null){
            Node newNode = new Node(t.data);
            temp.next = newNode;
            temp = newNode;
            t = t.next;
        }
        h = h.next;
        t = h;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}
