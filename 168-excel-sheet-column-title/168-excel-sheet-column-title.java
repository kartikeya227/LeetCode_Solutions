class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
}