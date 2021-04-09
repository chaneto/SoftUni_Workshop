package ATECHMODUL.Objects_and_Classes_Ex.Opinion_Poll;

public class Opinion_Poll {
private String name;
private Integer age;
public Opinion_Poll(String name, Integer age){
    this.name = name;
    this.age = age;
}

public String getName(){
    return name;
}
public Integer getAge(){
    return age;
}

    /**
     * @return
     */
public String toString(){
    String out = String.format("%s - %d",this.name,this.age);
    return out;
}
}
