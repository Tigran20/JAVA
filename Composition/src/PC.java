


public class PC {
    private Case aCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
