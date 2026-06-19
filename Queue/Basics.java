import java.util.LinkedList;
import java.util.Queue;

class Basics{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        // Add
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());

        System.out.println(q.remove()); //remove first element
        // use q.remove() or p.poll()

        // just to check the first element, use peek() or element()
        System.out.println(q.peek());
        System.out.println(q.element());
    }
}