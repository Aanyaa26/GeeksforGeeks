Date: 24.11.24
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n = arr.length;
        int current = 0;
        int left =0;
        int right = n-1;
        
        while(current <= right){
            
            if(arr[current]==0){
                swap(arr, current, left);
                left++;
                current++;
            }
            
            else if (arr[current]==1){
                current++;
            }
            
            else{
                swap(arr,current, right);
                right--;
            }
            
        }
        
    }
    
    public void swap(int[]arr, int a, int b ){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
