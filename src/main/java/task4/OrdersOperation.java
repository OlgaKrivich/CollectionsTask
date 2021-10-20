package task4;

import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.lang3.RandomStringUtils;

public class OrdersOperation {

    public String[] createArrayOfOrders() {
        String[] orders = new String[6];
        orders[0] = "AA";
        orders[1] = "AA";
        for (int i = 2; i < orders.length; i++) {
            orders[i] = RandomStringUtils.randomAlphabetic(2);
        }
        return orders;
    }

    public void createOrdersHashSet(String[] orders) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < orders.length; i++) {
            hashSet.add(orders[i]);
        }

        System.out.println("HashSet elements:");
        Iterator<String> itrHashSet = hashSet.iterator();
        while (itrHashSet.hasNext()) {
            System.out.println(itrHashSet.next());
        }
    }

    public void createOrdersTreeSet(String[] orders) {
        HashSet<String> treeSet = new HashSet<>();
        for (int i = 0; i < orders.length; i++) {
            treeSet.add(orders[i]);
        }

        System.out.println();
        System.out.println("TreeSet elements:");
        Iterator<String> itrTreeSet = treeSet.iterator();
        while (itrTreeSet.hasNext()) {
            System.out.println(itrTreeSet.next());
        }
    }

}
