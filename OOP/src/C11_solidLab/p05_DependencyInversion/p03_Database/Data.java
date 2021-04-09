package C11_solidLab.p05_DependencyInversion.p03_Database;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Data {
    private List<Course> courses;

    public Data() {
        this.courses = new ArrayList<> ();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        courses.add (course);
    }

    public List<Integer> courseIds() {
        List<Integer> id = new ArrayList<> ();
        for(Course out : getCourses ()){
            id.add (out.getId ());
        }return id;
    }
    public List<String> courseNames() {
        List<String> name = new ArrayList<> ();
        for(Course out : getCourses ()){
            name.add (out.getName ());
        }return name;
    }
    public List<String> search(String substring) {
        List<String> name = new ArrayList<> ();
        for(Course out : getCourses ()){
            if(out.getName ().contains (substring)){
            name.add (out.getName ());
            }
        }return name;

    }
    public String getCourseById(int id) {
        String output = "";
        for(Course out : getCourses ()){
            if(out.getId () == id){
                output =  out.getName ();
            }
        }return output;

    }
}
