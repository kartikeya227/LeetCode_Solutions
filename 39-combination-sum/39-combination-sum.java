class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Using Set so that we only store unique solutions
        Set<List<Integer>> combi = new HashSet<>();
        
        // Calling the backtracking function for each index as a starting
        for(int i=0; i<candidates.length; i++){
            dfs(combi, new ArrayList<Integer>(), i, 0, candidates, target);
        }
        
        // Converting Set to List 
        return combi.stream().collect(Collectors.toList());
    }
    
    // Backtracking function to add one element at a time and test if it will result in desired solution or not.
    boolean dfs(Set<List<Integer>> combi, List<Integer>tempList, int k, int sum, int[] candidates, int target){
        // Base condition for success
        if(sum==target){
            combi.add(new ArrayList<>(tempList));
            return true;
        } 
        // Base condition for case when set wont satisfy required condition
        else if ( sum>target){
            return false;
        }
        for(int i=k; i<candidates.length; i++){
            // No need to call dfs if we already know that input index is gonna result in a larger value than target.
            if((sum+candidates[i])>target)
                continue;
            tempList.add(candidates[i]);
            sum += candidates[i];
            dfs(combi, tempList, i, sum, candidates, target);
            // Backtracking -- start
            sum -= candidates[i];
            tempList.remove(tempList.size()-1);
            // Backtracking --end
        }
        return false;
    }
}