Date: 09.10.24

  class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    i++;
                }
                else{
                    return i;
                }
            }
        }
        return 0 ;
    }
}
