package recursion;


import structures.TreeNode;

public class PathSum {
    public static void main(String[] args) {

        TreeNode tn4 = new TreeNode(23);
        TreeNode tn5 = new TreeNode(25);
        TreeNode tn2 = new TreeNode(22, tn4, tn5);
        TreeNode tn6 = new TreeNode(52);
        TreeNode tn7 = new TreeNode(32);
        TreeNode tn3 = new TreeNode(42, tn6, tn7);
        TreeNode tn1 = new TreeNode(12, tn2, tn3);
        System.out.println(hasPathSum(tn1, 57));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum-=root.val;
        if (targetSum == 0 && root.left==root.right) {
            return true;
        }
        return hasPathSum(root.left, targetSum)
                || hasPathSum(root.right, targetSum);
    }
}

