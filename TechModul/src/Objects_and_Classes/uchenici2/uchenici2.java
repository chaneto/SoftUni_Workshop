package ATECHMODUL.Objects_and_Classes.uchenici2;

public class uchenici2 {
public String firstName;
public String lastName;
public String age;
public String town;

   public uchenici2 (String firstName, String lastName, String age, String town){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.town = town;
   }
public String getFirstName(){
       return firstName;
}
public String getLastName(){
       return lastName;
}
public String getAge(){
       return age;
}
public String getTown(){
       return town;
}
}
