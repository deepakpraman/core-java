package com.bigdreams.corejava.datastructures.stacks;

import java.util.HashMap;
import java.util.Stack;

public class LC_20_ValidParanthesis {
    public static void main(String[] args) {
        boolean isValid = isValid("(){}({[]})");
        System.out.println("Result " + isValid);
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }


    private static boolean isValid_MySolution(String s) {
        String openingBrackets = "({[";
        String closingBrackets = ")}]";
        Stack stack = new Stack();

        if(s.length()==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            String sChar = String.valueOf(s.charAt(i));
            if (openingBrackets.contains(sChar)){
                stack.push(sChar);
            }
            if(closingBrackets.contains(sChar)){
                System.out.println("is closing bracket");
                String matchingClosingBracket = String.valueOf(openingBrackets.charAt(closingBrackets.indexOf(sChar)));
                    if(stack.empty()){
                        return false;
                    }
                    if(stack.lastElement().equals(matchingClosingBracket)){
                        stack.pop();
                    }else{
                        System.out.println("Brackets not matching");
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
