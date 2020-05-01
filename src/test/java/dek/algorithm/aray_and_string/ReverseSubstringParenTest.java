package dek.algorithm.aray_and_string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseSubstringParenTest {

    @Test
    public void reverseParenthesesTest() {
        ReverseSubstringParen reverseSubstringParen = new ReverseSubstringParen();

        String s_1 = "(abcd)";
        assertEquals(reverseSubstringParen.reverseParentheses(s_1), "dcba");

        String s_2 = "(u(love)i)";
        assertEquals(reverseSubstringParen.reverseParentheses(s_2), "iloveu");

        String s_3 = "(ed(et(oc))el)";
        assertEquals(reverseSubstringParen.reverseParentheses(s_3), "leetcode");

        String s_4 = "a(bcdefghijkl(mno)p)q";
        assertEquals(reverseSubstringParen.reverseParentheses(s_4), "apmnolkjihgfedcbq");
    }
}
