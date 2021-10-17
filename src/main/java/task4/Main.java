package task4;

public class Main {

    public static void main(String[] args) {
        OrdersOperation ordersOperation = new OrdersOperation();
        ordersOperation.createOrdersHashSet(ordersOperation.createArrayOfOrders());
        ordersOperation.createOrdersTreeSet(ordersOperation.createArrayOfOrders());
    }
}
