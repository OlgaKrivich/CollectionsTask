package task5;

public class Main {

    public static void main(String[] args) {
        CombineTwoListsIntoMapOperation mapOperation = new CombineTwoListsIntoMapOperation();
        mapOperation.combineTwoListsIntoMapVersion1(mapOperation.addToKeyList(),
                mapOperation.addToValueList());
        mapOperation.combineTwoListsIntoMapVersion2(mapOperation.addToKeyList(),
                mapOperation.addToValueList());
    }
}
