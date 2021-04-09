package ATECHMODUL.Objects_and_Classes_Ex.Articles;

public class Articles {
private String zaglavie;
private String tekst;
private String avtor;

    public Articles(String zaglavie, String tekst, String avtor) {
        this.zaglavie = zaglavie;
        this.tekst = tekst;
        this.avtor = avtor;
    }

    public String getZaglavie() {
        return zaglavie;
    }public String getTekst() {
        return tekst;
    }public String getAvtor(){
        return avtor;
    }


    public void setZaglavie(String zaglavie) {
        this.zaglavie = zaglavie;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }
    public String toString (){
        String out = String.format("%s - %s: %s",this.getZaglavie(),this.tekst, this.avtor);
        return out;
    }
}
