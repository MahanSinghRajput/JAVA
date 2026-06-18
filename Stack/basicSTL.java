import java.util.*;
class basicSTL{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Push (Inserting)
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st); // you can print the stack
        System.out.println(st.size()); //size of stack

        // Peek (returns the topmost element without removing it)
        System.out.println(st.peek()); // 3
        System.out.println(st.peek()); // 3

        // Pop (returns the topmost element and removes it)
        System.out.println(st.pop()); // 3
        System.out.println(st.pop()); // 2  now the stack only has [1]
        st.pop(); // Now the stack is empty, you not need to store the result of pop

        // isEmpty checks if the stack is empty or not
        System.out.println(st.isEmpty());

    }
}