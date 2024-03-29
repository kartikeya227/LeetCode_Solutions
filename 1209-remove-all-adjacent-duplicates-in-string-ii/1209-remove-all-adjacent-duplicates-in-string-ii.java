class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Node> stack = new Stack();
        for(char ch: s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek().ch == ch){
                stack.peek().count++;               
                if (stack.peek().count == k) {
                    stack.pop();
                }
            }
            else {
                stack.push(new Node(ch, 1));
            }
        } 
        
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            Node top = stack.pop();
            for(int i = 0; i < top.count; i++)
            ans.append(top.ch);
        }
        return ans.reverse().toString();
    }
    
    class Node {
        char ch;
        int count;
        public Node(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    
}
