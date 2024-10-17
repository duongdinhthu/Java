package JavaThread.SynchronousVsAsynchronous;

// SynchronousExample.java
public class SynchronousExample {

    public static void main(String[] args) {

        // Thực hiện các tác vụ đồng bộ (tuần tự)
        System.out.println("== Synchronous Example ==");

        long startTime = System.currentTimeMillis();

        // Tác vụ 1
        syncTask("Task 1");

        // Tác vụ 2
        syncTask("Task 2");

        long endTime = System.currentTimeMillis();
        System.out.println("Total time for synchronous tasks: " + (endTime - startTime) + " ms");
    }

    // Phương thức đồng bộ, thực hiện từng tác vụ lần lượt
    public static void syncTask(String taskName) {
        System.out.println(taskName + " started...");
        try {
            Thread.sleep(2000);  // Giả lập thời gian thực hiện 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed.");
    }
}
