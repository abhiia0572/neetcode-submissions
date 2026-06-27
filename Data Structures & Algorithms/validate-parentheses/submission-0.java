class Solution {
    boolean parantheses(char x, char y){
        return ((x == '(' && y == ')' || (x == '{' && y == '}') || (x == '[' && y == ']')));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }
            if(!stack.isEmpty()&&parantheses(stack.peek(), x)){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
