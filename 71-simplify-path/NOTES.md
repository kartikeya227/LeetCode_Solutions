class Solution {
public String simplifyPath(String path) {
Stack<String> st = new Stack<String>();
StringBuilder sb = new StringBuilder();
char prev = '/';
String temp;
int i =0;
for(char c : path.toCharArray()){
if(Character.isLetterOrDigit(c)){
sb.append(c);
} else{
temp = sb.toString();
sb.setLength(0);
if(temp.length()>0)
st.push(temp);
if(path.charAt(i)=='.' && path.charAt(i-1)=='.' && (i==path.length()-1 || path.charAt(i+1)!='.') && st.size()>0){
st.pop();
}
prev=c;
}
i++;
}
return st.stream().collect(Collectors.joining("/","/",""));
}
}