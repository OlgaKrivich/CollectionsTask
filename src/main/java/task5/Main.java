package task5;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

    public static void main(String[] args) {
        combineTwoListsIntoMapVersion1(createListOfKeys(5), createListOfValues(6));
        combineTwoListsIntoMapVersion2(createListOfKeys(4), createListOfValues(6));
    }

    public static <K> ArrayList<K> createListOfKeys(int keyNumber) {
        ArrayList<K> listOfKeys = new ArrayList<>();
        for (int i = 0; i < keyNumber; i++) {
            K key = (K) RandomStringUtils.randomNumeric(4);
            listOfKeys.add(key);
        }
        return listOfKeys;
    }

    public static <V> ArrayList<V> createListOfValues(int valueNumber) {
        ArrayList<V> listOfValues = new ArrayList<>();
        for (int i = 0; i < valueNumber; i++) {
            V value = (V) RandomStringUtils.randomNumeric(5);
            listOfValues.add(value);
        }
        return listOfValues;
    }

    public static <K, V> void combineTwoListsIntoMapVersion1(ArrayList<K> listOfKeys,
            ArrayList<V> listOfValues) {
        SortedMap<K, V> combinedMap = new TreeMap<>();

        if (listOfKeys.size() > listOfValues.size()) {
            for (int i = 0; i < listOfKeys.size(); i++) {
                combinedMap.put(listOfKeys.get(i), null);
            }
        } else {
            for (int i = 0; i < listOfValues.size(); i++) {
                for (int j = i; j < listOfKeys.size(); j++) {
                    combinedMap.put(listOfKeys.get(j), listOfValues.get(i));
                }
            }
        }

        for (Map.Entry pairEntry : combinedMap.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }

    }

    public static <K, V> void combineTwoListsIntoMapVersion2(ArrayList<K> listOfKeys,
            ArrayList<V> listOfValues) {

        if (listOfKeys.size() > listOfValues.size()) {
            throw new IllegalArgumentException("Value is not enough for map");
        } else {
            throw new IllegalArgumentException("Key is not enough for map");
        }
    }
}
