public class Opera extends MusicalShow{
    private final int choirSize;

    public Opera(Director director, int duration, String title, String musicAuthor, String librettoText, int choirSize) {
        super(director, duration, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
