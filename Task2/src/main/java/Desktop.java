public class Desktop extends DesktopComputer {
    String videocard;

    public Desktop(String processor, String OZU, String hard_drive, String videocard) {
        super(processor, OZU, hard_drive);
        this.videocard = videocard;
    }
    @Override
    public String toString(){
        return " процессор:" + this.processor + ", ОЗУ:" + this.OZU + ", жесткий диск:" + this.hard_drive+", видеокарта:"+this.videocard;
    }
}
