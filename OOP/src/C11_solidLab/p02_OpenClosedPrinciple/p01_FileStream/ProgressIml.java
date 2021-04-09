package C11_solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class ProgressIml implements Progress{
    private String name;
    private int length;
    private int sent;

    public ProgressIml(String name, int length, int sent) {
        this.name = name;
        this.length = length;
        this.sent = sent;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getSent() {
        return sent;
    }

    @Override
    public int getCurrentPercent() {
        return getSent() * 100 / getLength();
    }
}

