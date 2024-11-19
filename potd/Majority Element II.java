Date: 20.11.24
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        List<Integer>result = new ArrayList <>();
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
