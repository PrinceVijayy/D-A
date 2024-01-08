package recursion;

import structures.BinaryNode;

public class BinaryTree {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(7);
        root.left = new BinaryNode(6);
        root.right = new BinaryNode(8);
        root.left.left = new BinaryNode(5);
        root.right.right = new BinaryNode(9);

        postorder(root);
    }

    static void inorder(BinaryNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.key);
        inorder(root.right);
    }

    static void preorder(BinaryNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.key);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(BinaryNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.key);
    }
}


