package dek.algorithm.aray_and_string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Answer is accepted by Leetcode
 */
public class GroupAnagramsTest {

    @Test
    public void groupAnagramsTest() {
        String[] in = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = new ArrayList<>();
        ArrayList<String> list_1 = new ArrayList<String>();
        list_1.add("ate");
        list_1.add("eat");
        list_1.add("tea");
        output.add(list_1);

        ArrayList<String> list_2 = new ArrayList<String>();
        list_2.add("nat");
        list_2.add("tan");
        output.add(list_2);

        ArrayList<String> list_3 = new ArrayList<String>();
        list_3.add("bat");
        output.add(list_3);

        List<List<String>> res = GroupAnagrams.groupAnagrams(in);
        for(int i = 0; i < output.size(); ++i) {
            assertThat(res.get(i), is(output.get(i)));
        }

    }
}
