package C11_solidLab.p05_DependencyInversion.p03_Database;

import java.util.ArrayList;
import java.util.List;

public class Courses extends Data{
    public void printAll() {
        List<Course> courses = getCourses ();
        for(Course out : courses){
            System.out.println (out.getName () + " - " + out.getId ());
        }
    }
    public void printIds() {
        List<Integer>coursesIds = courseIds();
        for(Integer out : coursesIds){
            System.out.println (out);
        }
    }
    public void printById(int id) {
        String course = getCourseById(id);
        System.out.println (course);
    }
    public void searches(String substring) {
        List<String> courses = search (substring);
        for(String out : courses){
            System.out.println (out);
        }
    }
}
