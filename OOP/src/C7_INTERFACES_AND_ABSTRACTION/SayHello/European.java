package C7_INTERFACES_AND_ABSTRACTION.SayHello;

public class European implements Person{
  private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
