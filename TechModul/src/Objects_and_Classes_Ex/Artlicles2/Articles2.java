package ATECHMODUL.Objects_and_Classes_Ex.Artlicles2;

public class Articles2 {
 private String zaglavie;
 private String tekst;
 private String avtor;

 public Articles2(String zaglavie, String tekst, String avtor){
     this.zaglavie = zaglavie;
     this.tekst = tekst;
     this.avtor = avtor;
 }

    public String getZaglavie() {
        return zaglavie;
    }

    public String getTekst() {
        return tekst;
    }

    public String getAvtor() {
        return avtor;
    }

    public String toString(){
     String out = String.format("%s - %s: %s",this.zaglavie,this.tekst,this.avtor);
     return out;
 }
}
