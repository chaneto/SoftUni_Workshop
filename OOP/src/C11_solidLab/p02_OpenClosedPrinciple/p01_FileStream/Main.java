package C11_solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class Main {
    public static void main(String[] args) {
        ProgressIml progressIml = new Music ("Dependents", "Dependents".length (), 5, "Desert");
        ProgressIml progressIml1 = new File ("MyPictures", "MyPictures".length (), 6);
        System.out.println (progressIml.getCurrentPercent ());
        System.out.println (progressIml1.getCurrentPercent ());
    }
}

