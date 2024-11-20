Date: 20.11.24

class Solution {
    void nextPermutation(int[] arr) {
        int ind =-1;
        int n = arr.length;
        
        
        //loop to find out the break point 
        for(int i= n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                ind =i;
                break;
            }
            
        }
        
        if(ind ==-1){
            reverse(arr, 0, n - 1);;
            return;
        }
        
        // loop to swap values with the next largest
        
        for(int i = n-1; i>ind; i--){
            if(arr[i]>arr[ind]){
                swap(arr, i, ind);
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);
        
    }
    public void swap(int []arr, int i, int ind){
        int temp = arr[ind];
        arr[ind] = arr[i];
        arr[i] = temp;
        
    }
    public void reverse(int []arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }
}
