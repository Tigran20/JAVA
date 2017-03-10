
public class Hen extends Bird{

    public void davGrains()
    {

    }

    public void eat()
    {
        davGrains();
        ingest();
        digest();
    }

    @Override
    public void voice()
    {
        System.out.println("Co-co-co! My weight is: " + weight);
    }

}
