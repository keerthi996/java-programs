public class Mobile {
    private String brand;
    private Type type;
    private int ram;
    private long battery;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public long getBattery() {
        return battery;
    }

    public void setBattery(long battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", type=" + type +
                ", ram=" + ram +
                ", battery=" + battery +
                '}';
    }
}
enum Type{
    ANDROID,KEYPAD,IOS;
}
