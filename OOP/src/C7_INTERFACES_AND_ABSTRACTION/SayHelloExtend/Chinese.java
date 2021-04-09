package C7_INTERFACES_AND_ABSTRACTION.SayHelloExtend;

public class Chinese extends BasePerson implements Person{

    public Chinese(String name) {
        super (name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
