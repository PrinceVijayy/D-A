 class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;
    public TreeNode(int val) {
        this.val = val;
        this.leftNode = null;
        this.rightNode = null;
    }
    public TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}

public class Tree{
    public static void main(String[] args) {
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        TreeNode t2=new TreeNode(2,t4,t5);
        TreeNode t6=new TreeNode(6);
        TreeNode t7=new TreeNode(7);
        TreeNode t3=new TreeNode(3,t6,t7);
        TreeNode t1=new TreeNode(1,t2,t3);

        preOrder(t1);
    }

    private static void preOrder(TreeNode root) {
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }
}

