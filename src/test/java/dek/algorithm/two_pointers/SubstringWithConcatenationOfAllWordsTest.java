package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SubstringWithConcatenationOfAllWordsTest {

    @Test
    public void substringWithConcatenationOfAllWordsTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words), new int[]{0, 9}, "message here");

        s = "wordgoodgoodgoodbestword";
        String[] words2 = {"word","good","best","word"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words2), new int[]{}, "hahahahaha");

        s = "catbatatecatatebat";
        String[] words3 = {"cat", "ate", "bat"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words3), new int[]{0 ,3, 9}, "hohohoho");

        s = "abcdababcd";
        String[] words4 = {"ab", "ab", "cd"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words4), new int[]{0 ,2, 4}, "hehehehehe");
    }
}
