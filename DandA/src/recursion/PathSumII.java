package recursion;

import structures.TreeNode;

public class PathSumII {
    public static void main(String[] args) {
        TreeNode t8=new TreeNode(3);
        TreeNode t9=new TreeNode(-2);
        TreeNode t4=new TreeNode(3,t8,t9);
        TreeNode t11=new TreeNode(1);
        TreeNode t5=new TreeNode(2,null,t11);
        TreeNode t2=new TreeNode(5,t4,t5);
        TreeNode t7=new TreeNode(11);
        TreeNode t3=new TreeNode(-3,null,t7);
        TreeNode t1=new TreeNode(10,t2,t3);

        System.out.println( pathSum(t1,8));
    }
    public static int pathSum(TreeNode root, int targetSum) {
        return helper2(root, targetSum, 0);
    }

    public static int helper2(TreeNode root, int targetSum, int count) {
        if (root == null) {
            return count;
        }
        if (helper(root, targetSum)) {
            count += 1;
        }
         return helper2(root.left, targetSum, count)+
                    helper2(root.right, targetSum, count);
    }

    public static boolean helper(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (targetSum == 0) {
            return true;
        }
        return helper(root.left, targetSum)
                || helper(root.right, targetSum);
    }
}
