package tree;

public class traversel {
    public static class Node{
        int val;
        Node left;
        Node right;
    }
    public static void preorder(Node root){ //root left right
        if (root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){ // left right root
        if (root==null)return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
