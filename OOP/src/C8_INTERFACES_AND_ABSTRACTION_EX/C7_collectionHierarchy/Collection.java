package C8_INTERFACES_AND_ABSTRACTION_EX.C7_collectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private  int maxSize;
    private List<String> items;

    protected Collection() {
        this.items = new ArrayList<>();
        this.maxSize=100;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<String> getItems() {
        return items;
    }
}
