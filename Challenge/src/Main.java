

public class Main{

    public static void main(String[] args) {

        OutLander outLander = new OutLander(36);

        outLander.accelerate(30);
        System.out.println();

        outLander.steer(45);
        outLander.accelerate(20);
        System.out.println();
    }
}
