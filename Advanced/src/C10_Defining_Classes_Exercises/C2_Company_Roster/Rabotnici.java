package C10_Defining_Classes_Exercises.C2_Company_Roster;

public class Rabotnici {
   private String name;
   private double salary;
   private String position;
   private String sfera;
   private String imeil;
   private int age;
   public Rabotnici(String name, double salary, String position,String sfera){
      this.name = name;
      this.salary = salary;
      this.position = position;
      this.sfera = sfera;
      this.imeil = "n/a";
      this.age = -1;
   }
   public Rabotnici(String name, double salary, String position,String sfera, String imeil){
      this(name, salary, position, sfera);
      this.imeil = imeil;
   }
   public Rabotnici(String name, double salary, String position,String sfera, int age){
      this(name, salary, position, sfera);
      this.age = age;
   }public Rabotnici(String name, double salary, String position,String sfera, String imeil, int age){
      this.name = name;
      this.salary = salary;
      this.position = position;
      this.sfera = sfera;
      this.imeil = imeil;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public String getPosition() {
      return position;
   }

   public String getSfera() {
      return sfera;
   }

   public String getImeil() {
      return imeil;
   }

   public int getAge() {
      return age;
   }
}
