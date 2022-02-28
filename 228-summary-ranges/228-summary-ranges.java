class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        if(nums.length==0)
            return ans;
        
        int i, j=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                sb.append(nums[j]);
                if(i-1!=j){
                    sb.append("->");
                    sb.append(nums[i-1]);
                }
                ans.add(sb.toString());
                sb = new StringBuilder();
                j=i;
            }
        }
        sb.append(nums[j]);
        if(j!=nums.length-1){
            sb.append("->");
            sb.append(nums[i-1]);
        }
        ans.add(sb.toString());
        return ans;
    }
}