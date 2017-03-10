import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        ArrayList<Bird> animals = new ArrayList<>();

        addAnimals(animals);

        Collections.sort(animals, new BirdComporator());
        for (Bird animal : animals)
        {
            animal.voice();
        }
    }

    public static void addAnimals(ArrayList<Bird> animals){

        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Duck());
        animals.add(new Frog());
        animals.add(new Hen());

    }
}
