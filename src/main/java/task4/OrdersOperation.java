package task4;

import java.util.HashSet;
import java.util.Iterator;

public class OrdersOperation {

    public String[] createArrayOfOrders() {
        String[] orders = new String[10];
        orders[0] = "car";
        orders[1] = "dish";
        orders[2] = "plates";
        orders[3] = "car";
        orders[4] = "mixer";
        orders[5] = "dish";
        return orders;
    }

    public void createOrdersHashSet(String[] orders){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(orders[0]);
        hashSet.add(orders[1]);
        hashSet.add(orders[2]);
        hashSet.add(orders[3]);
        hashSet.add(orders[4]);
        hashSet.add(orders[5]);

        System.out.println("HashSet elements:");
        Iterator<String> itrHashSet = hashSet.iterator();
        while (itrHashSet.hasNext()){
            System.out.println(itrHashSet.next());
        }
    }

    public void createOrdersTreeSet(String[] orders){
        HashSet<String> treeSet = new HashSet<>();
        treeSet.add(orders[0]);
        treeSet.add(orders[1]);
        treeSet.add(orders[2]);
        treeSet.add(orders[3]);
        treeSet.add(orders[4]);
        treeSet.add(orders[5]);

        System.out.println();
        System.out.println("TreeSet elements:");
        Iterator<String> itrTreeSet = treeSet.iterator();
        while (itrTreeSet.hasNext()){
            System.out.println(itrTreeSet.next());
        }
    }

}
