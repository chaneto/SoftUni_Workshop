package C7_INTERFACES_AND_ABSTRACTION.SayHello;

public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String sayHello(){
        return "Здравей";
    }

    @Override
    public String getName() {
        return null;
    }
}
