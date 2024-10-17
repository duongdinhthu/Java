package JavaCoreBasic.Memory;

public class Main {
    public static void main(String[] args) {
        HeapAndStack heapAndStack = new HeapAndStack();//heapAndStack là tham chieu luu trong stack
        heapAndStack.setAge(1); // gia tri cua object se duoc luu trong heap
        heapAndStack.setName("mai");
        System.out.println(heapAndStack.toString()); // lay gia tri tu heap ra
        System.out.println(heapAndStack.getAge());// lay gia tri tu heap ra
    }
}
