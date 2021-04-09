package C10_Defining_Classes_Exercises.C1_Opinion_Poll;

public class OpinionPoll {
    private String name;
    private int age;

   public OpinionPoll(String name, int age){
       this.name = name;
       this.age = age;
   }

    public String getName(){
       return name;
    }
    public int getAge(){
       return age;
    }
}
