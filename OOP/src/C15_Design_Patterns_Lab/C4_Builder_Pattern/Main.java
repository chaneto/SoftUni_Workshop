package C15_Design_Patterns_Lab.C4_Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress ();
        adress.setName ("Petko")
                .setEmail ("Petko@...")
                .setPhoneNumber ("0123456789")
                .setCountry ("Tambuktu")
                .setCity ("Grobencel")
                .setState ("Bern")
                .AdressLine1 ("Josef-Kistler-str 18");
        System.out.println (adress.getName () + ", " + adress.getEmail ()+ ", " + adress.getCity ());

    }
}
