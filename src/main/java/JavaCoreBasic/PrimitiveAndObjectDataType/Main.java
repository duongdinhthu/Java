package JavaCoreBasic.PrimitiveAndObjectDataType;


import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String ko; // khai bao bien chi dung trong class này ( tính đóng gói )
    private static int a ;
    private static long b ;
    private static float c ;
    private static double d ;
    private static char e ;
    private static boolean f ;
    private static byte g ;
    private static short h ;
    static int age = 31;
    // kiểu dữ liệu objects
    static String name = "thu";

public static void main(String[] args) {
    Integer ageInt = 31;
    System.out.println("kieu du lieu nguyen thuy:" + age);
    System.out.println("kieu du lieu object:" + name);
    System.out.println("======================");
// thuc hien so sanh
    boolean ss = (ageInt.equals(age));//Unboxing:
    boolean sss = (age == ageInt);// Autoboxing
    System.out.println(sss);
    System.out.println(ss);

    // thuc hien chuyen doi
    Integer ok = age;
    System.out.println("thuc hien chuyen doi : " + ok);
    System.out.println("=================================");
    System.out.println("Gia tri khi khoi tao bien cho kieu nguyen thuy :");
    System.out.println(a + "  " + b + "  " + c + "  " + d + "  " + e + "  " + f + "  " + g + "  " + h);

    System.out.println("=================================");
    System.out.println(" gia tri khoi tao của kieu object : ");
    System.out.println(ko);
}

}
