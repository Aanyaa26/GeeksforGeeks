Date: 01.09.24

class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int i=0;
        int j=0;
        int sum1=0;
        int sum2 =0;
        int ans = 0;
        
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                sum1= sum1+arr1.get(i++);
                
            }
            else if(arr1.get(i)>arr2.get(j)){
                sum2 = sum2+arr2.get(j++);
            }
            else{
                ans+=Math.max(sum1,sum2)+arr1.get(i);
                i++;
                j++;
                sum1=0;
                sum2=0;
            }
        }
        while(i<arr1.size())sum1+=arr1.get(i++);
        while(j<arr2.size())sum2+=arr2.get(j++);
        return ans+Math.max(sum1,sum2);
        
    }
}
