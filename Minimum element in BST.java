class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        if(root==null)return Integer.MAX_VALUE;
        
        int left = minValue(root.left);
        int right = minValue(root.right);
        
        return Math.min(root.data, Math.min(left,right));
    }
}
