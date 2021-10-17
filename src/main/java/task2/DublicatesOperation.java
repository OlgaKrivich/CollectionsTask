package task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DublicatesOperation {

    public Set<String> setWithoutDublicates(ArrayList<String> listWithDublicates) {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < listWithDublicates.size(); i++) {
            stringSet.add(listWithDublicates.get(i));
        }
        return stringSet;
    }

    public ArrayList<String> addToList() {
        ArrayList<String> listWithDublicates = new ArrayList<>();
        listWithDublicates.add("fhdfjjf");
        listWithDublicates.add("fhdfjjf");
        listWithDublicates.add("dlsdpsp");
        listWithDublicates.add("alalala");
        listWithDublicates.add("alalala");
        return listWithDublicates;
    }
}
