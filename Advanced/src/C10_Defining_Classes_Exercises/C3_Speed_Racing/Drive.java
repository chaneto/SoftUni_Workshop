package C10_Defining_Classes_Exercises.C3_Speed_Racing;

public class Drive {
private String cmd;
private String car;
private int km;
public Drive(String car, int km){
    this.car = car;
    this.km = km;
}
public String getCar(){
    return car;
}
public int getKm(){
    return km;
}
}
