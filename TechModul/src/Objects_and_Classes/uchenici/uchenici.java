package ATECHMODUL.Objects_and_Classes.uchenici;

public class uchenici {
    private String firstName;
    private String lsttName;
    private String age;
    private String homeTown;

    public uchenici(String firstName, String lsttName, String age, String homeTown) {
        this.firstName = firstName;
        this.lsttName = lsttName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLsttName() {
        return lsttName;
    }

    public String getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLsttName(String lsttName) {
        this.lsttName = lsttName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
