package C8_INTERFACES_AND_ABSTRACTION_EX.C7_collectionHierarchy;

public class AddCollection extends Collection implements Addable {

    private int index = 0;

    public AddCollection() {
        super();
    }

    @Override
    public int add(String str) {
            super.getItems().add(str);
            return index++;
    }

}
