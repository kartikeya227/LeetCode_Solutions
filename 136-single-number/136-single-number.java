class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            // Performing BIT manupulation read notes for extra info.
            sum ^= num;
        }
        return sum;
    }
}