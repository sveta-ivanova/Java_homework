import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ComputerImpl laptop = new Laptop("Intel Pentium Gold 7505", "8 ГБ", "SSD 256 ГБ", "1920x1080", "membrane", "Twisted Nematic");
        ComputerImpl nettop = new Nettop("Intel Celeron 1037U", "DDR3", "2 ТБ");
        ComputerImpl netbook = new Netbook("Intel Core i5", "8 ГБ", "SSD 512 ГБ", "1920x1080", "membrane", " Intel UHD Graphics");
        ComputerImpl monoblock = new Monoblock("Intel Core i5", "8 ГБ", "SSD 256 ГБ", "4096x2304", "AMD Radeon Pro 560X");
        ComputerImpl servercomputer = new ServerComputer("Intel Core i3", "8GB", "240Gb");
        ComputerImpl desktop = new Desktop("Intel Core i5-9600K", "9 Mb", "SSD 500 Gb", "Intel UHD 630");
        ComputerImpl[] Computer = new ComputerImpl[]{laptop, nettop, netbook, monoblock, servercomputer, desktop};
        for (int i = 0; i < 6; i++) {
            System.out.println(Computer[i].turn_on());
            System.out.println(Computer[i].turn_off());
            System.out.println(Computer[i].connected());
        }
    }
}
