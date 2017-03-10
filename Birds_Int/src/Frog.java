
public class Frog extends Bird{

    public Frog()
    {
        weight = 10 + 50 * Math.random();
    }

    @Override
    public void eat()
    {

    }

    @Override
    public void move() {

    }

    @Override
    public void voice() {
        System.out.println("Kva-kva-kva! My weight is: " + weight);
    }
}
