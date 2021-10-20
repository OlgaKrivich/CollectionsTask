package task5;

public class Main {

    public static void main(String[] args) {
        CombinationOperation mapOperation = new CombinationOperation();
        mapOperation.combineTwoListsIntoMapVersion1(mapOperation.createListOfKeys(5),
                mapOperation.createListOfValues(6));
        mapOperation.combineTwoListsIntoMapVersion2(mapOperation.createListOfKeys(4),
                mapOperation.createListOfValues(6));
    }
}
