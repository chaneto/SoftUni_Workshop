package C8_INTERFACES_AND_ABSTRACTION_EX.C3_Birthday_Celebrations;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
