class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = s.length()-1, j = t.length()-1;
        while(i>-1 && j>=i){
            if(s.charAt(i)==t.charAt(j))
                i--;
            j--;
        }
        return i<0;
    }
}