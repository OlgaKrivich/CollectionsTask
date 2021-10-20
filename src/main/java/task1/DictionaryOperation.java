package task1;

import java.util.Map;
import java.util.TreeMap;

public class DictionaryOperation {

    public Map<Character, Integer> createDictionary(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> charsMap = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (charsMap.containsKey(chars[i])) {
                Integer count = charsMap.get(chars[i]);
                charsMap.put(chars[i], count + 1);
            } else {
                charsMap.put(chars[i], 1);
            }
        }
        return charsMap;
    }
}
