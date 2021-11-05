package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

    public static void main(String[] args) {
//        System.out.println(createDictionary("djdjjdsbfhskaoaokiaso"));
        String text = RandomStringUtils.randomAlphabetic(20);
        Map<Character, Integer> dictionary = buildCharacterDictionaryFromString(text);
        for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


//    public static Map<Character, Integer> createDictionary(String text) {
//        char[] chars = text.toCharArray();
//        Map<Character, Integer> charsMap = new TreeMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            if (charsMap.containsKey(chars[i])) {
//                Integer count = charsMap.get(chars[i]);
//                charsMap.put(chars[i], count + 1);
//            } else {
//                charsMap.put(chars[i], 1);
//            }
//        }
//        return charsMap;
//    }

    public static Map<Character, Integer> buildCharacterDictionaryFromString(String text) {
        char[] charTextArray = text.toCharArray();
        Map<Character, Integer> dictionary = new HashMap<>();
        for (char c : charTextArray) {
            if (dictionary.containsKey(c)) {
                dictionary.put(c, dictionary.get(c) + 1);
            } else {
                dictionary.put(c, 1);
            }
        }
        return dictionary;
    }

}
