package C7_INTERFACES_AND_ABSTRACTION.SayHelloExtend;

public class Bulgarian extends BasePerson implements Person{

    public Bulgarian(String name) {
        super (name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
