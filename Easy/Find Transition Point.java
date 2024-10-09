Date: 09.10.24
  class Solution {
    int transitionPoint(int arr[], int n) {
        for(int i=0; i<n;i++){
            if (arr[i]==1)return i;
        }
        return -1;
    }
}
