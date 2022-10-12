public abstract class PortableComputer extends ComputerImpl {

    Screen screen;
    Keyboard keyboard;
    public PortableComputer(String processor, String OZU, String hard_drive, String screen, String keyboard) {
        super(processor, OZU, hard_drive);
        this.screen = new Screen(screen);
        this.keyboard = new Keyboard(keyboard);
    }
    @Override
    public String toString(){
        return "процессор:" + this.processor + ", ОЗУ:" + this.OZU + ", жесткий диск:" + this.hard_drive+", монитор:"+this.screen+", клавиатура"+this.keyboard;
    }
}
