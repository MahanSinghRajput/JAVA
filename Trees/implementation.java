package Trees;

public class implementation {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    // prints in preorder sequence
    public static void display(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            //System.out.println(root.val + " -> null, null");
            return;
        }
        System.out.print(root.val + " -> ");
        if(root.left != null) System.out.print(root.left.val + ", ");
        else System.out.print("null, ");
        if(root.right != null) System.out.print(root.right.val + "");
        else System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    // gives the number of nodes of the tree
    public static int size(Node root){
        if(root == null) return 0;
        int left = size(root.left);
        int right = size(root.right);
        return 1 + left + right;
    }

    // gives the totalSum of all the nodes
    public static int totalSum(Node root){
        if(root == null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);
    }

    // gives the max value of the tree
    public static int max(Node root){
        if(root == null) return 0;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    // height of the tree (node-wise)
    public static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // height of the tree (edge-wise)
    public static int height2(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height2(root.left), height2(root.right));
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

        //display(a);
        System.out.println(size(a));
        System.out.println(totalSum(a));
        System.out.println(max(a));
        System.out.println(height(a));
        System.out.println(height2(a));
    }
}
