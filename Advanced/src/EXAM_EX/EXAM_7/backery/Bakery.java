package EXAM_EX.EXAM_7.backery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bakery {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<> ();
    }

    public void add(Employee employee) {
        if (employees.size () < this.capacity) {
            this.employees.add (employee);
        }
    }

    public boolean remove(String name) {
        return this.employees.removeIf (f -> f.getName ().equals (name));
    }

    public Employee getOldestEmployee() {
        return this.employees.stream ().max (Comparator.comparing (Employee::getAge)).orElse (null);
    }

    public Employee getEmployee(String name) {
        Employee employee = null;
        for (Employee out : this.employees) {
            if (out.getName ().equals (name)) {
                employee = out;
            }
        }
        return employee;
    }

    public int getCount() {
        return this.employees.size ();
    }

    public String report() {
        String output = "";
        for (Employee out : employees) {
            output += out.toString ();
            output += System.lineSeparator ();
        }
        return String.format ("Employees working at Bakery %s:%n%s", this.name, output);
    }
}
