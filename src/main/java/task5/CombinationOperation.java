package task5;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CombinationOperation {

    public ArrayList<String> addToKeyList() {
        ArrayList<String> listOfKeys = new ArrayList<>();
        listOfKeys.add("jjf");
        listOfKeys.add("fkf");
        listOfKeys.add("dla");
        listOfKeys.add("dhf");
        listOfKeys.add("dhdkdkdf");
        return listOfKeys;
    }

    public ArrayList<Integer> addToValueList() {
        ArrayList<Integer> listOfValues = new ArrayList<>();
        listOfValues.add(1);
        listOfValues.add(2);
        listOfValues.add(3);
        listOfValues.add(4);
        listOfValues.add(5);
        listOfValues.add(6);
        return listOfValues;
    }

    public void combineTwoListsIntoMapVersion1(ArrayList<String> listOfKeys,
            ArrayList<Integer> listOfValues) {
        SortedMap<String, Integer> combinedMap = new TreeMap<>();

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

    public void combineTwoListsIntoMapVersion2(ArrayList<String> listOfKeys,
            ArrayList<Integer> listOfValues) {

        if (listOfKeys.size() > listOfValues.size()) {
            throw new IllegalArgumentException("Value is not enough for map");
        } else {
            throw new IllegalArgumentException("Key is not enough for map");
        }
    }
}
