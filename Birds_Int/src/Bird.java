
public class Bird implements Vertebrata{
    private String name;
    private int age;
    private String type;
    double weight;


    public Bird()
    {
        weight = 10 + 100 * Math.random();
    }


    @Override
    public void eat()
    {

    }

    @Override
    public void move()
    {

    }

    @Override
    public void voice()
    {

    }


    public void ingest()
    {

    }

    public void digest()
    {

    }

    public int compareTo(Bird bird)
    {
        return (int) Math.round(bird.weight - weight);
    }

}
