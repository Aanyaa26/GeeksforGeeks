class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null )return list;
         dfs(root, list);
         return list;
    }
    public static void dfs(Node node, ArrayList<Integer>list){
        if(node==null)return;
        list.add(node.data);
        dfs(node.left,list);
        
        dfs(node.right,list);
        
        
    }
}
