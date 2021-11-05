package task4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        String[] listOrders = {"Order1", "Order3", "Order2", "Order4", "Order5", "Order2",
                "Order4"};
        Set<String> treeSetOrderList = new TreeSet<>();
        Set<String> hashSetOrderList = new HashSet<>();

        for (String order : listOrders) {
            treeSetOrderList.add(order);
            hashSetOrderList.add(order);
        }
        System.out.println(treeSetOrderList);
        System.out.println(hashSetOrderList);
    }
}
