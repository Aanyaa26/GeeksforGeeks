Date: 02.12.24
     
class Solution {
    public static long[] productExceptSelf(int arr[]) {
        long count =0;
        long product =1;
        
        long []ans = new long [arr.length];
        
        for(int i=0;i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(count==0){
                product = arr[i]*product;
            }
            else if(count==1 && arr[i]!=0){
                product = arr[i]*product;
            }
            else if(count==1 && arr[i]==0){
                continue;
            }
            else{
                product =0;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(count==0){
                ans[i]=product/arr[i];
            }
            else if(count==1 && arr[i]!=0){
                ans[i]=0;
            }
            else if(count==1 && arr[i]==0){
                ans[i]=product;
            }
            else if(count>1){
                ans[i]=0;
            }
        }
        return ans;
    }
}
