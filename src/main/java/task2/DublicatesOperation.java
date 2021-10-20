package task2;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomStringUtils;

public class DublicatesOperation {

    public <V> Set<V> createSetWithoutDublicates(ArrayList<V> listWithDublicates) {
        Set<V> collectionWithoutDublicates = new TreeSet<>();
        collectionWithoutDublicates.addAll(listWithDublicates);

        return collectionWithoutDublicates;
    }

    public <V> ArrayList<? extends V> createListWithDublicates(int elementsNumber) {
        ArrayList<V> collectionWithDublicates = new ArrayList<>();
        collectionWithDublicates.add(0, (V) "111");
        collectionWithDublicates.add(1, (V) "111");

        for (int i = 2; i <= elementsNumber; i++) {
            collectionWithDublicates.add(i, (V) RandomStringUtils.randomAlphabetic(3));
        }

        return collectionWithDublicates;
    }


}
