Date: 16.11.24

  class Solution {
    public static void swap (int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        // step 1 : initialize j with index with 0 number
        int j =-1;
        
        for(int i = 0; i< n ; i++){
            if(arr[i]==0){
                j =i ;
                break;
            }
        }
        
         if (j == -1) {
            return;
        }
        // step 2 : traverse and swap
        
        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
