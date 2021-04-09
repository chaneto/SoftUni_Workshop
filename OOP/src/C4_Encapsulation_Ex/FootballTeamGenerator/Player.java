package FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName (name);
        setEndurance (endurance);
        setSprint (sprint);
        setDribble (dribble);
        setPassing (passing);
        setShooting (shooting);
    }

    private void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new IllegalArgumentException ("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        if(endurance >= 0 && endurance <= 100){
        this.endurance = endurance;
        }else {
            throw new IllegalArgumentException ("Endurance should be between 0 and 100.");
        }
    }

    private void setSprint(int sprint) {
        if(sprint >= 0 && sprint <= 100){
        this.sprint = sprint;
        }
        else {
            throw new IllegalArgumentException ("Sprint should be between 0 and 100.");
        }
    }

    private void setDribble(int dribble) {
        if(dribble >= 0 && dribble <= 100){
        this.dribble = dribble;
        }
        else {
            throw new IllegalArgumentException ("Dribble should be between 0 and 100.");
        }
    }

    private void setPassing(int passing) {
        if(passing >= 0 && passing <= 100){
        this.passing = passing;
        }
        else {
            throw new IllegalArgumentException ("Passing should be between 0 and 100.");
        }
    }

    private void setShooting(int shooting) {
        if(shooting >= 0 && shooting <= 100){
        this.shooting = shooting;
        }
        else {
            throw new IllegalArgumentException ("Shooting should be between 0 and 100.");
        }
    }

    public String getName() {
        return name;
    }
    public double overallSkillLevel(){
        return (double) (this.endurance + this.shooting + this.passing + this.dribble + this.sprint) / 5.00;
    }
}