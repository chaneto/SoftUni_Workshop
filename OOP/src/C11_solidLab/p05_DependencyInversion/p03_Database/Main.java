package C11_solidLab.p05_DependencyInversion.p03_Database;

public class Main {
    public static void main(String[] args) {
        Course course = new Course ("Informatica", 345);
        Course course1 = new Course ("Geometria", 555);
        Course course2 = new Course ("Driviving", 987);
        Course course3 = new Course ("Soft", 657);
        Courses courses = new Courses ();
        courses.addCourse (course);
        courses.addCourse (course1);
        courses.addCourse (course2);
        courses.addCourse (course3);
        System.out.println (courses.courseIds ());
        System.out.println (courses.getCourseById (657));
        System.out.println (courses.courseNames ());
        courses.printAll ();
        courses.printById (345);
        courses.printIds ();
        courses.searches ("i");
    }
}
