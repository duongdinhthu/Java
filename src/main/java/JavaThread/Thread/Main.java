package JavaThread.Thread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Tạo đối tượng MyThread
        thread.start(); // Khởi chạy thread
        System.out.println("Thread đã được bắt đầu");
        Thread thread1 = new Thread(new MyRunnable()); // Tạo Thread từ đối tượng Runnable
        thread1.start(); // Khởi chạy thread
        System.out.println("Thread đã được bắt đầu = Runnable");

        System.out.println("Chay demo mutil threading :");
        Task task = new Task();
        Task2 task2 = new Task2();

        task.start(); // Khởi chạy thread task1
        task2.start(); // Khởi chạy thread task2

        System.out.println("Cả hai task đang chạy song song");

    }
}
