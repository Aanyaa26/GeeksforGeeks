Date: 28.04.25
class Solution {
    public long largesSumCycle(int N, int Edge[]) {
        int n = Edge.length;
        int[] vis = new int[n];
        Arrays.fill(vis, 0);
        long[] result = {-1};
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (vis[i] != 1) {
                dfs(i, Edge, vis, stack, set, result);
            }
        }
        return result[0];
    }

    public void dfs(int node, int[] Edge, int[] vis, Stack<Integer> stack, HashSet<Integer> set, long[] result) {
        vis[node] = 1;
        set.add(node);
        stack.push(node);

        int nextnode = Edge[node];
        if (nextnode != -1) {
            if (set.contains(nextnode)) {
                // Cycle detected
                long cyclesum = 0;
                Stack<Integer> cyclenodes = new Stack<>();
                while (!stack.isEmpty()) {
                    int cyclenode = stack.pop();
                    cyclenodes.push(cyclenode);
                    if (cyclenode == nextnode) break;
                }
                while (!cyclenodes.isEmpty()) {
                    cyclesum += cyclenodes.pop();
                }
                result[0] = Math.max(result[0], cyclesum);
            }
            else if (vis[nextnode] == 0) {
                dfs(nextnode, Edge, vis, stack, set, result);
            }
        }

        if (!stack.isEmpty() && stack.peek() == node) {
            stack.pop();
        }
        set.remove(node);
        vis[node] = 2;
    }
}
