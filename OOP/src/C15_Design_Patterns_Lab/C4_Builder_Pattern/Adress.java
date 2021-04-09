package C15_Design_Patterns_Lab.C4_Builder_Pattern;

public class Adress {
    private String name;
    private String email;
    private String phoneNumber;
    private String country;
    private String state;
    private String city;
    private String adressLine1;
    private String adressLine2;

    public Adress() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAdressLine1() {
        return adressLine1;
    }

    public String getAdressLine2() {
        return adressLine2;
    }

    public Adress setName(String name) {
        this.name = name;
        return this;
    }

    public Adress setEmail(String email) {
        this.email = email;
        return this;
    }

    public Adress setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Adress setCountry(String country) {
        this.country = country;
        return this;
    }

    public Adress setState(String state) {
        this.state = state;
        return this;
    }

    public Adress setCity(String city) {
        this.city = city;
        return this;
    }

    public Adress AdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
        return this;
    }

    public Adress setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
        return this;
    }
}
