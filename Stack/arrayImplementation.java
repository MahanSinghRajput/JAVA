public class arrayImplementation {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = -1;

        void push(int val){
            if(isFull()) throw new IndexOutOfBoundsException("Stack is full");
            arr[++idx] = val;
        }

        int peek(){
            if(idx == -1) throw new IndexOutOfBoundsException("Stack is empty");
            return arr[idx];
        }

        int pop(){
            if(idx == -1) throw new IndexOutOfBoundsException("Stack is empty");
            return arr[idx--];
        }

        void display(){
            if(idx == -1) {
                System.out.println("[]");
                return;
            }
            System.out.print("[");
            for(int i=0;i<idx;i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[idx] + "]");
        }

        boolean isEmpty(){
            return idx == -1;
        }

        boolean isFull(){
            return idx == arr.length - 1;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
    }
}
