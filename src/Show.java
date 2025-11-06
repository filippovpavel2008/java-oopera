import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(Director director, int duration, String title) {
        this.director = director;
        this.duration = duration;
        this.title = title;
    }

    public void actorsInfo() {
        for (Actor listOfActor : listOfActors) {
            System.out.println(listOfActor.toString());
        }
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр уже присутствует в спектакле");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр добавлен в спекталь");
        }
    }

    public void replaceActor(Actor newActor, String oldActorSurName) {
        int replaceIndex = -1;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(oldActorSurName)) {
                replaceIndex = listOfActors.indexOf(actor);
                break;
            }
        }

        if (replaceIndex < 0) {
            System.out.println(oldActorSurName + " не учавствует в спектакле");
        } else {
            listOfActors.set(replaceIndex, newActor);
            System.out.println("Актёр успешно заменен");
        }
    }
}
