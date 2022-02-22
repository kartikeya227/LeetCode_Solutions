class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        
        if(columnNumber>26){
            ans.append(convertToTitle(columnNumber%26==0?columnNumber/26-1 :columnNumber/26)) ;
        }
        int rem = columnNumber%26==0? 26 : columnNumber%26;
        ans.append((char)(64+(rem)));
        
        return ans.toString();
    }
}