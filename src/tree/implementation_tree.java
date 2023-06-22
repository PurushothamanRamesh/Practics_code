package tree;

import java.lang.reflect.Method;

public class implementation_tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static void disply(Node root){
        if (root==null) return;
        System.out.print(root.val+" -> ");
        if (root.left!=null) System.out.print(root.left.val+" ");
        if (root.right!=null)System.out.print(root.right.val);
        System.out.println();
        disply(root.left);
        disply(root.right);
    }

    public static int size(Node root){
        if (root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if (root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int max(Node root){
        if (root==null)return Integer.MIN_VALUE;
        int max=Math.max(max(root.left),max(root.right));
        return Math.max(root.val,max);
    }
    public static int min(Node root){
        if (root==null)return Integer.MAX_VALUE;
        int min=Math.min(min(root.left),min(root.right));
        return Math.min(root.val,min);

    }
    public static int levels(Node root){
        if (root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public static int product(Node root){
        if (root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
//            1
//        2       3
//    4     5  6     7

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        System.out.println("DISPLAYING THE ELEMTS ");
        disply(a);
        System.out.println("DISPLAYING THE SIZE OF TREE ");
        System.out.println(size(a));
        System.out.println("DISPLAYING THE SUM OF TREE");
        System.out.println(sum(a));
        System.out.println("DISPLAYING THE MAXIMUM VALUE OF TREE");
        System.out.println(max(a));
        System.out.println("DISPLAYING THE MINIMUM VALUE OF TREE");
        System.out.println(min(a));
        System.out.println("DISPLAYING THE  LEVEL OF TREE");
        System.out.println(levels(a));
        System.out.println("DISPLAYING THE  PRODUCT  OF TREE");
        System.out.println(product(a));
    }
}
