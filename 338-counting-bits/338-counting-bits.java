class Solution {
    public int[] countBits(int n) {
        int i=0, j=0;
        double two = Math.log(2);
        int [] ans = new int[n+1];
        ans[0] = 0;
        for(i=1;i<=n;i++){
            if(isLogBaseTwo(i, two)){
                ans[i]=1;
                j=i;
            } else{
                ans[i]=ans[i-j]+ans[j];
            }
        }
        return ans;
    }
    
    boolean isLogBaseTwo(int n, double two){
        double f = Math.log(n)/two;
        if((f - (int)f) == 0.0)
            return true;
        return false;
    }
}