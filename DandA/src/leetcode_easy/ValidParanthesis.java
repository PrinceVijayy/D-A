package leetcode_easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("}["));
    }

    public static boolean isValid(String s) {

        String closing = "}])>";

        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> myStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (myStack.empty() && closing.indexOf(c) != -1) {
                return false;
            } else if (c == '{') {
                myStack.push('}');
            } else if (c == '[') {
                myStack.push(']');
            } else if (c == '(') {
                myStack.push(')');
            } else if (c == '<') {
                myStack.push('>');
            } else if ( c == myStack.lastElement()) {
                myStack.pop();
            } else {
                break;
            }
        }
        return myStack.empty();
    }
}
