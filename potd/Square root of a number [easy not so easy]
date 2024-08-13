Date: 13.08.24

class Solution {
    long floorSqrt(long n) {
        if(n==1) return 1;
        long start =0;
        long end = n/2;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid >n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
