package ATECHMODUL.Objects_and_Classes.Songs;

public class Songs {

    private String typelist;
    private String name;
    private String time;

    public Songs(String typelist, String name, String time) {
        this.typelist = typelist;
        this.name = name;
        this.time = time;
    }

    public String getTypelist() {
        return typelist;
    }

    public String getName() {
        return name;
    }



}
