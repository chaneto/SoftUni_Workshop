package C4_Encapsulation_Ex.Pizza_Calories;

public class Dough {
    private String flourType;
    private String bakingTechniqu;
    private double weight;

    public Dough(String flourType, String bakingTechniqu, double weight) {
        setFlourType (flourType);
        setBakingTechniqu (bakingTechniqu);
        setWeight (weight);
    }

    private void setFlourType(String flourType) {
        if(flourType.equals ("White") || flourType.equals ("Wholegrain")){
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException ("Invalid type of dough.");
        }

    }

    private void setBakingTechniqu(String bakingTechniqu) {
        if(bakingTechniqu.equals ("Crispy") || bakingTechniqu.equals ("Chewy") || bakingTechniqu.equals ("Homemade")){
        this.bakingTechniqu = bakingTechniqu;
        }else {
            throw new IllegalArgumentException ("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if(weight >= 1 && weight <= 200){
        this.weight = weight;
        }else {
            throw new IllegalArgumentException ("Dough weight should be in the range [1..200].");
        }
    }public double calculateCalories(){
        double flour = 0;
        double baking = 0;
        if(this.flourType.equals ("White")){
            flour = 1.5;
        }else if(this.flourType.equals ("Wholegrain")){
            flour = 1.0;
        }if(this.bakingTechniqu.equals ("Crispy")){
            baking = 0.9;
        }else if(this.bakingTechniqu.equals ("Chewy")){
            baking = 1.1;
        }else if(this.bakingTechniqu.equals ("Homemade")){
            baking = 1.0;
        }return 2 * weight * baking * flour;
    }
}
