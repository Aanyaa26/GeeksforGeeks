Date: 16.03.25
  class Solution {
    static int sumOfDigits(int n) {
        int ans =0;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            ans += rem;
            temp =temp/10;
        }
        return ans;
    }
}
