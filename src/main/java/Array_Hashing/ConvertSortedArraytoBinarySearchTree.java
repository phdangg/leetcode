package Array_Hashing;

public class ConvertSortedArraytoBinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode divide(int[] nums, int l, int r) {
        if (l >= r) return null;
        int m = (l+r)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = divide(nums,l,m-1);
        root.right = divide(nums,m+1,r);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return divide(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        divide(nums,0,nums.length-1);
        // l:0 m:7, r: 14
        // l:0 m:3  r:7
        // l:0 m:1  r:3
        sortedArrayToBST(nums);
    }
}
