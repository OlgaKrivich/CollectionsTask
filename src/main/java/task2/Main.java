package task2;

public class Main {

    public static void main(String[] args) {
        DublicatesOperation dublicatesOperation = new DublicatesOperation();
        System.out.println(dublicatesOperation
                .createSetWithoutDublicates(dublicatesOperation.createListWithDublicates(4)));

    }
}
