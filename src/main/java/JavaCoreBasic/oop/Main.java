package JavaCoreBasic.oop;


public class Main {
    public static void main(String[] args) {
        OopCar oopCar = new OopCar();
        oopCar.setColor("mau den");
        System.out.println(oopCar);
        OopRolroy oopRolroy = new OopRolroy(2);// khoi tao va truyen tham so tuoi xe cho xe Rolroy
        oopRolroy.setDoor("cua canh chim");
        oopRolroy.setWheel("banh nho 20 cm");
        System.out.println(oopRolroy);// in ra xe Rolroy( lop con )
        oopRolroy.sound();// goi phuong thuc da ghi de cua lop cha
        oopCar.sound();
    }
}
