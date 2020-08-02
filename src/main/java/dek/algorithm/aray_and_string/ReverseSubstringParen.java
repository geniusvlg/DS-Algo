package dek.algorithm.aray_and_string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseSubstringParen {
    int i;

    public String reverseParentheses(String s) {
        i = 0;
        return reverse(new StringBuilder(s), new StringBuilder());
    }

    private String reverse(StringBuilder str, StringBuilder out) {
        while(i < str.length()) {
            Character currChar = str.charAt(i);
            if(currChar == ')') {
                ++i;
                return out.reverse().toString();
            } else if (currChar == '(') {
                ++i;
                out.append(reverse(str, new StringBuilder()));
            } else {
                ++i;
                out.append(currChar);
            }
        }

        return out.toString();
    }
}
