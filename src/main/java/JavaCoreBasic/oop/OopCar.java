package JavaCoreBasic.oop;

public class OopCar {
    // tinh dong goi cua OOP
    double hight = Double.valueOf("3.2");
    private String color = "mau do"; // chi duoc truy cap o lop hien tai
    public String door = "cua canh buom";// truy cap o bat ki dau
    protected String wheel = "banh xe ban kinh 30 CM"; // truy cap o lop hien tai và trong package

    public OopCar() {
    }

    public OopCar(double hight, String color, String door, String wheel) {
        this.hight = hight;
        this.color = color;
        this.door = door;
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "OopCar{" +
                "hight=" + hight +
                ", color='" + color + '\'' +
                ", door='" + door + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }

    // phuong thuc cua lop cha
    void sound(){
        System.out.println("coi xe da san sang ");
    }
}
