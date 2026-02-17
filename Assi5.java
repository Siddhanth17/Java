interface RemoteControl {
    void turnOn();
    void turnOff();
    void increaseVolume();
    void decreaseVolume();
}

class TV implements RemoteControl {
    public void turnOn() { System.out.println("TV ON"); }
    public void turnOff() { System.out.println("TV OFF"); }
    public void increaseVolume() { System.out.println("Volume Increased"); }
    public void decreaseVolume() { System.out.println("Volume Decreased"); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.increaseVolume();
    }
}
