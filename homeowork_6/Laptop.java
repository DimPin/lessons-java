package homeowork_6;

public class Laptop {
    int RAM;
    int HD;
    String OS;
    String color;
    
    public Laptop(int RAM, int HD, String OS, String color) {
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }
    public String getOS() {
        return OS;
    }
    public int getHD() {
        return HD;
    }
    public String getColor() {
        return color;
    }
}
