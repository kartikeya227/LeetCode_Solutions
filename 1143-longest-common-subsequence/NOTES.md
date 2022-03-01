int [][] dp = new int [1001][1001];
public int longestCommonSubsequence(String text1, String text2) {
int [][] dp = new int [text1.length()+1][text2.length()+1];
for( int[] row : dp){
Arrays.fill(row,-1);
}
return lcs(text1, text2, text1.length(), text2.length(), dp);
}
int lcs(String text1, String text2, int i, int j, int[][] dp){
// Base condition
if(i==0 || j==0)
return 0;
// DP using the previously calculated values.
if(dp[i][j]!=-1)
return dp[i][j];
if(text1.charAt(i-1)==text2.charAt(j-1)){
dp[i][j] =  lcs(text1, text2, i-1, j-1, dp) + 1;
return dp[i][j];
} else {
dp[i][j] = Math.max(lcs(text1, text2, i-1, j, dp), lcs(text1, text2, i, j-1, dp));
return dp[i][j];
}
}
}
```
​
**JAVA DP - Top-Down Approach using DP Table**
```
class Solution {
int [][] dp = new int [1001][1001];
public int longestCommonSubsequence(String text1, String text2) {
int [][] dp = new int [text1.length()+1][text2.length()+1];
int i,j;
for(i=1; i<text1.length()+1; i++){
for(j=1; j<text2.length()+1; j++){
// DP
if(text1.charAt(i-1)==text2.charAt(j-1))
dp[i][j] = dp[i-1][j-1] + 1;
else
dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
}
}
return dp[text1.length()][text2.length()];
}
}
```