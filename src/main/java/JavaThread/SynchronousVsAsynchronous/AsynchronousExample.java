package JavaThread.SynchronousVsAsynchronous;

public class AsynchronousExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("== Asynchronous Example ==");

        // Tạo các luồng con
        Thread task1 = new Thread(() -> asyncTask("Task 1"));
        Thread task2 = new Thread(() -> asyncTask("Task 2"));

        // Bắt đầu chạy các luồng con
        task1.start();
        task2.start();

        // Đợi các luồng con hoàn thành trước khi tiếp tục

        task1.join();
        task2.join();
        // Luồng chính sẽ đợi cho đến khi các luồng con kết thúc
        System.out.println("Main thread finishes after both tasks are completed.");
    }

    // Phương thức bất đồng bộ tạo luồng mới
    public static void asyncTask(String taskName) {
        System.out.println(taskName + " started...");
        try {
            Thread.sleep(2000);  // Giả lập công việc mất 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed.");
    }
}
