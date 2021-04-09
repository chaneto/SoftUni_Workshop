package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.enums;

public enum State {

    INPROGRESS("inProgress"), FINISHED("Finished");

    private String status;

     State(String status){
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

}
