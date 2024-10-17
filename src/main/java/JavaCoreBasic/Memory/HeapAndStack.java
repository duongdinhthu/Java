package JavaCoreBasic.Memory;

public class HeapAndStack {
    private int age = 10;// khi khoi chay chuong trinh , bien age(du lieu nguyen thuy duoc luu vao stack )
    private String name = "thu";// gia tri thu duoc luu vao heap , name ( tham chieu ) duoc luu vao stack
    public HeapAndStack() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeapAndStack{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
