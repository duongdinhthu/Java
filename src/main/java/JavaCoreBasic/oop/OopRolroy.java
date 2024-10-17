package JavaCoreBasic.oop;

public class OopRolroy extends OopCar {
    private int age;

    public OopRolroy(int age) {
        super();
        this.age = age;
    }
    @Override
    void sound(){
        // private khong cho goi tu lop con , chi co the goi bang getter
        System.out.println("I'm an Oop Rolroy . coi xe san sang ch Rolroy");
    }

    @Override
    public String toString() {
        return "OopRolroy{" +
                "hight = " + hight +'\''+
                ", age=" + age +  '\'' +
                ", color=" + getColor() +  '\'' +
                ", door='" + door + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
