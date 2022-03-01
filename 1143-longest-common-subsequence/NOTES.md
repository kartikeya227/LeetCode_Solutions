**Just Recursive Code -- Top Down**
```
class Solution {
public int longestCommonSubsequence(String text1, String text2) {
return lcs(text1, text2, text1.length(), text2.length());
}
int lcs(String text1, String text2, int i, int j){
if(i==0 || j==0){
return 0;
}
if(text1.charAt(i-1)==text2.charAt(j-1)){
return lcs(text1, text2, i-1, j-1) + 1;
} else {
return Math.max(lcs(text1, text2, i-1, j), lcs(text1, text2, i, j-1));
}
}
}
```