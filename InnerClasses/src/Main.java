public class Main {
    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(5);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000) + " RPM");
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000) + " RPM");
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000) + " RPM");
    }
}
