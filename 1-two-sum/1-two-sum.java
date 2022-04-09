class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i<nums.length;i++){
            int compliment = target-nums[i];
            
            if(map.containsKey(nums[i]) && map.get(nums[i])!=i){
                return new int[] {map.get(nums[i]),i};
            }
            map.put(compliment,i);
        }
        return null;
    }
}