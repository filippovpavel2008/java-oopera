public class MusicalShow extends Show{
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(Director director, int duration, String title, String musicAuthor, String librettoText) {
        super(director, duration, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    protected void printLibretto(){
        System.out.println(librettoText);
    }
}
