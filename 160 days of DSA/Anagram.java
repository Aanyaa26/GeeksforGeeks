Date: 30.11.24
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        
        if(s1.length()!= s2.length())return false;

        char temp [] = s1.toCharArray();
        char temp2 [] = s2.toCharArray();
        
        Arrays.sort(temp);
        Arrays.sort(temp2);
        int start = 0;
        int end = s1.length()-1;
        
        while(start<=end){
            if(temp[start]!=temp2[start]){
                return false;
                
            }
            else{
                start++;
                
                
            }
        }
        return true;
    }
}
