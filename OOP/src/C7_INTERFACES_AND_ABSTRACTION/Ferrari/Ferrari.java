package C7_INTERFACES_AND_ABSTRACTION.Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private static final String brakes = "Brakes!";
    private static final String gas = "brum-brum-brum-brrrrr";
    private static final String model = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return brakes;
    }

    @Override
    public String gas() {
        return gas;
    }

    @Override
    public String toString() {
        return String.format ("%s/%s/%s/%s",model,brakes,gas,this.driverName);
    }
}
