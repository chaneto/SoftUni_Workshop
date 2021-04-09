package C1_Abstraction.C3_Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {

        this.repo = new HashMap<> ();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] args) {
        String name = args[1];
        if (args[0].equals ("Create")) {
            comandCreate (args, name);
        } else if (args[0].equals ("Show")) {
            if (repo.containsKey (name)) {
                Student student = repo.get (name);
                System.out.println (student.toString ());
            }
        }
    }

    private void comandCreate(String[] args, String name) {
        int age = Integer.parseInt (args[2]);
        double grade = Double.parseDouble (args[3]);
        if (!repo.containsKey (name)) {
            Student student = new Student (name, age, grade);
            repo.put (name, student);
        }
    }
}
