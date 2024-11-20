Date: 20.11.24
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = -1;
        // loop for intialisation 
        for(int i =0; i<n; i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        if(j==-1)return ;
        // loop for swaping
        for(int i=j+1 ; i<n; i++){
            if(arr[i]!=0){
                swap (arr, i ,j);
                j++;
            }
        }
        
    }
    public void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
        
    }
}
