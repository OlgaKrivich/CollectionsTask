package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // System.out.println(createSetWithoutDublicates(createListWithDublicates(4)));
        // List<String> values = List.of("123", "123", "123");
        //System.out.println(removeDublicates(values));
        ArrayList collectionWithDublicates = new ArrayList<>();
        collectionWithDublicates.add(0, "111");
        collectionWithDublicates.add(1, "111");


    }

    public static <T> Collection<T> removeDublicates(Collection<T> collection) {
        return new TreeSet<>(collection);
    }

//    public static Set createSetWithoutDublicates(ArrayList listWithDublicates) {
//        Set collectionWithoutDublicates = new TreeSet<>();
//        collectionWithoutDublicates.addAll(listWithDublicates);
//        return collectionWithoutDublicates;
//    }
//
//    public static <V> ArrayList<? extends V> createListWithDublicates(int elementsNumber) {
//        ArrayList<V> collectionWithDublicates = new ArrayList<>();
//        collectionWithDublicates.add(0, (V) "111");
//        collectionWithDublicates.add(1, (V) "111");
//
//        for (int i = 2; i <= elementsNumber; i++) {
//            collectionWithDublicates.add(i, (V) RandomStringUtils.randomAlphabetic(3));
//        }
//        return collectionWithDublicates;
//    }

}
