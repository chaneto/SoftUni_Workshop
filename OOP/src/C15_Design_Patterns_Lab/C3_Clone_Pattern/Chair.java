package C15_Design_Patterns_Lab.C3_Clone_Pattern;

public class Chair implements ProtoType{
    private int height;
    private int width;
    private String color;

    public Chair(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
    private Chair(Chair chair){
        this.height = chair.height;
        this.width = chair.width;
        this.color = chair.color;
    }

    @Override
    public Chair clone() {
        return new Chair (height, width, color);
    }
    @Override
    public Chair clone1() {
        return new Chair (this);
    }
}
