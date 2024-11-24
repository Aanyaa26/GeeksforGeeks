Date: 24.11.24

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(sum>max)max=sum;
            
            if(sum<0)sum=0;
            
        }
        return max;
        
    }
}
