public class ServerComputer extends ComputerImpl {

    public ServerComputer(String processor, String OZU, String hard_drive) {
        super(processor, OZU, hard_drive);
    }

    @Override
    public String toString() {
        return " процессор:" + this.processor + ", ОЗУ:" + this.OZU + ", жесткий диск:" + this.hard_drive;
    }

}
