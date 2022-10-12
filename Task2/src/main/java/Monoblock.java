public class Monoblock extends DesktopComputer {
    private Screen screen;
    private Display display;
    public Monoblock(String processor, String OZU, String hard_drive, String screen,String display) {
        super(processor, OZU, hard_drive);
        this.screen = new Screen(screen);
        this.display= new Display(display);
    }
    @Override
    public String toString(){
        return " процессор:" + this.processor + ", ОЗУ:" + this.OZU + ", жесткий диск:" + this.hard_drive+", монитор:"+this.screen.screen+ ", дисплей:"+this.display.display;
    }
}
