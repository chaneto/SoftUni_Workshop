package ATECHMODUL.Objects_and_Classes_Ex.Order_by_Age;

public class Order {
    private String name;
    private Integer numer;
    private Integer age;

    public Order(String name, Integer numer, Integer age) {
        this.name = name;
        this.numer = numer;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getNumer() {
        return numer;
    }

    public Integer getAge() {
        return age;
    }public String toString(){
        String out = String.format("%s with ID: %d is %d years old.",this.name,this.numer,this.age);
        return out;
    }
}
