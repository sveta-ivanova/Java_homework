abstract public class ComputerImpl {
    String processor;
    String OZU;
    String hard_drive;

    public ComputerImpl(String processor, String OZU, String hard_drive) {
        this.processor = processor;
        this.OZU = OZU;
        this.hard_drive = hard_drive;
    }

    public String turn_on() {
        return getClass().getSimpleName() + toString() + " turn on";
    }

    public String turn_off() {
        return getClass().getSimpleName() + toString() + " turn off";
    }

    public String connected() {
        return getClass().getSimpleName() + toString() + " is connected";
    }

    public String toString() {
        return " процессор:" + this.processor + ", ОЗУ:" + this.OZU + ", жесткий диск:" + hard_drive;
    }
}
