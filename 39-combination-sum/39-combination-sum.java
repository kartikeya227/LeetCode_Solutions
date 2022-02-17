class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> combi = new HashSet<>();
        
        for(int i=0; i<candidates.length; i++){
            dfs(combi, new LinkedList<Integer>(), i, 0, candidates, target);
        }
        return combi.stream().collect(Collectors.toList());
    }
    
    boolean dfs(Set<List<Integer>> combi, List<Integer>tempList, int k, int sum, int[] candidates, int target){
        if(sum==target){
            combi.add(new LinkedList<>(tempList));
            return true;
        } else if ( sum>target){
            return false;
        }
        for(int i=k; i<candidates.length; i++){
            tempList.add(candidates[i]);
            sum += candidates[i];
            dfs(combi, tempList, i, sum, candidates, target);
            sum -= candidates[i];
            tempList.remove(tempList.size()-1);
        }
        return false;
    }
}