public class Laptop extends PortableComputer{
    private Display display;
    public Laptop(String processor, String OZU, String hard_drive, String screen, String keyboard,String display) {
        super(processor, OZU, hard_drive, screen, keyboard);
        this.display=new Display(display);
    }
    @Override
    public String toString(){
        return " процессор:" + this.processor + "; ОЗУ:" + this.OZU + "; жесткий диск:" + this.hard_drive+"; клавиатура:"+this.keyboard.keyboard+ "; монитор:"+this.screen.screen+"; дисплей:"+this.display.display;
    }
}
