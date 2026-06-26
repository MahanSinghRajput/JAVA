package Trees;
import java.util.*;
public class levelOrderTraversal {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void nthLevel(Node root, int n){
        if(root == null) return;
        if(n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    public static void bfs(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.poll();
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //nthLevel(a, 2);
        bfs(a);
    }
}
