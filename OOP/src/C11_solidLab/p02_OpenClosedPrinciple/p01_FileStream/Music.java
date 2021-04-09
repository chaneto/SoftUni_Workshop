package C11_solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class Music extends ProgressIml {
    private String Album;

    public Music(String name, int length, int sent, String Album) {
        super (name, length, sent);
        this.Album = Album;
    }

    public int getLength() {
        return super.getLength ();
    }

    public String getAlbum() {
        return this.Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }
}
