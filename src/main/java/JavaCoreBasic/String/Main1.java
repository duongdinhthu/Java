package JavaCoreBasic.String;

class Main1 {

    // khoi tao bien String theo kieu String pool
    static String name = "thu";

    // khoi tao bien string theo kieu dung new
    static String name1 = new String("thu");
    static String name2 = "THU";
    public static void main(String[] args) {

        System.out.println("khoi tao String pool: " + name);
        System.out.println("khoi tao String qua new :" + name1);
        System.out.println("khoi tao 1 String pool: " + name2);
        System.out.println("===================");
        System.out.println("Thuc hien so sanh bang toan tu == ( khong so sanh gia tri ma tham chieu vung nho:) ");
        if (name == name1){
            System.out.println("= nhau");
        }else {
            System.out.println("khong = nhau");
        }
        System.out.println("===================");
        System.out.println("thuc hien so sanh bang equal()");
        if (name.equals(name1)){
            System.out.println("equal() gia tri bang nhau");
        }else {
            System.out.println("equal() gia tri khong bang nhau");
        }
        System.out.println("============");
        System.out.println("thuc hien so sanh bo qua ki tu hoa - thuong");
        if (name.equalsIgnoreCase(name2)){
            System.out.println("= nhau");
        }else {
            System.out.println("khong = nhau");
        }


    }
}