public class Ballet extends MusicalShow{
    private final String choreographer;


    public Ballet(Director director, int duration, String title, String musicAuthor, String librettoText, String choreographer) {
        super(director, duration, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
