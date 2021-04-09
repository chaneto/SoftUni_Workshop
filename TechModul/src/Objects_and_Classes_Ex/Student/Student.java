package ATECHMODUL.Objects_and_Classes_Ex.Student;

public class Student {
    private String firstname;
    private String lastname;
    private Double ocenka;

    public Student(String firstname, String lastname, Double ocenka) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ocenka = ocenka;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Double getOcenka() {
        return ocenka;
    }
    public String toString(){
        String out = String.format("%s %s: %.2f",this.firstname,this.lastname,this.ocenka);
        return out;
    }
}
