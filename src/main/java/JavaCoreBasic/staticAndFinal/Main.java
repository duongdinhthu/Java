package JavaCoreBasic.staticAndFinal;

public class Main {
    // khai bao bien Static
    static String name = "thu";
    //khai bao bien final
    final String address = "thai binh";

    public Main() {
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        //bien static co the goi o trong ham luon ma khong can khoi tao doi tuong:
        System.out.println("ten toi la : " + name);
        // bien final khong the goi ma khong co doi tuong vi java khong biet field nay thuoc doi tuong nao
        //System.out.println("dia chi :" + address);

        // chi co the goi thong qua doi tuong cua lop
        Main main = new Main();
        System.out.println(main.getAddress());

        // bien final khong the sua , khong the tao setter cho field nay , chi co the get
    }
}
