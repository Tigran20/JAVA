


public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(40, 30, 5);
        Resolution nativeResolution = new Resolution(1920, 1080);

        Case TheCase = new Case("220v", "THERMALTAKE", "700", dimensions);
        Monitor monitor = new Monitor("rl2455hm", "BenQ",24, nativeResolution);
        Motherboard motherboard = new Motherboard("X299 CARBON AC", "MSI", 8, 4, "v2,55");

        PC ThePC = new PC(TheCase, monitor, motherboard);
        ThePC.getMonitor().drawPixelAt(1500, 1200, "красный");
        ThePC.getMotherboard().loadProgram("Windows 8.1");
        ThePC.getaCase().pressPowerButton();

    }
}
