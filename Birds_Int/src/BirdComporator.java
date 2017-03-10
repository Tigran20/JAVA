import java.util.Comparator;

public class BirdComporator implements Comparator<Bird>{
    @Override
    public int compare(Bird b1, Bird b2)
    {
        return (int) Math.round(b1.weight - b2.weight);
    }
}