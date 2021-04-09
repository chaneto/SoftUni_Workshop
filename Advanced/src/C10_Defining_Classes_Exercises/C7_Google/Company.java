package C10_Defining_Classes_Exercises.C7_Google;

public class Company {
    private String companyname;
    private String department;
    private double salary;

    public Company(String companyname, String department, double salary) {
        this.companyname = companyname;
        this.department = department;
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
