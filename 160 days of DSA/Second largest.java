Date: 20.11.24

BRUTE FORCE APPROACH
class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if(arr[0]==arr[n-1])return -1;
        if(n==1)return -1;
        
        int start = n-2;
        int end = n-1;
        while(start>=0){
            if(arr[start]==arr[end]){
                start--;
                end--;
            }
            
            else{
                return arr[start];
            }
            
        }
        return arr[start];
        
    }
}
