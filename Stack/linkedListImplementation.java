import java.util.EmptyStackException;

public class linkedListImplementation {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static class Stack{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(size == 0) throw new EmptyStackException();
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        int peek(){
            if(size == 0) throw new EmptyStackException();
            return head.val;
        }

        boolean isEmpty(){
            return size == 0;
        }

        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(10);
        System.out.println("Top element: " + st.peek()); // Outputs 10
        System.out.println("Popped element: " + st.pop()); // Outputs 10
        System.out.println("Current size: " + st.size()); // Outputs 1
    }
}
