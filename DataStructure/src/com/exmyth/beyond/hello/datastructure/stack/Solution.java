package com.exmyth.beyond.hello.datastructure.stack;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c == ')' && top != '('){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = new Solution().isValid("{[()]}");
        System.out.println(valid);
    }
}