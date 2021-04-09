package C1_Abstraction.C3_Student_System;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getGrade()
    {
        return this.grade;
    }

    public void setGrade(double grade) {

        this.grade = grade;
    }

    @Override
    public String toString() {
        String output = "";
        if (this.grade >= 5.00) {
            output += "Excellent student";
        } else if (this.grade < 5.00 && this.grade >= 3.50) {
            output += "Average student";
        } else {
            output += "Very nice person";
        }
        return String.format ("%s is %s years old. %s.", this.name, this.age, output);
    }
}
