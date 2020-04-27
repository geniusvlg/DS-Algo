package dek.algorithm.aray_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        Arrays.stream(strs).forEach(str -> {
            char[] curr = asciiMapping(str);

            String ns = new String(curr);

            if(map.containsKey(ns)) {
                map.get(ns).add(str);
            } else {
                ArrayList<String> newArr = new ArrayList<>();
                newArr.add(str);
                map.put(ns, newArr);
            }
        });

        res.addAll(map.values());

        return res;
    }

    public static char[] asciiMapping(String str) {
        char[] map = new char[26];
        for(int k = 0; k < str.length(); ++k) {
            map[str.charAt(k) - 'a']++;
        }

        return map;
    }

    public static boolean compare(int[] strA, int[] strB) {
        for(int i = 0; i < strA.length; ++i) {
            if(strA[i] != strB[i])
                return false;
        }
        return true;
    }
}
