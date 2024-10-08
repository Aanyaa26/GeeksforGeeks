Date: 08.10.24

    class Solution {
    public static int pairsum(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int sum =arr[n-2]+arr[n-1];
        return sum;
        
    }
}
