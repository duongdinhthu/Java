package JavaThread.SynchronousVsAsynchronous;

public class SynchronizedExample {

    private int count = 0;  // Biến dùng chung cho các luồng

    public static void main(String[] args) {

        SynchronizedExample example = new SynchronizedExample();

        // Tạo và chạy nhiều luồng
        Thread thread1 = new Thread(example::incrementCount);
        Thread thread2 = new Thread(example::incrementCount);

        thread1.start();
        thread2.start();

        try {
            thread1.join();  // Đợi cho thread1 hoàn thành
            thread2.join();  // Đợi cho thread2 hoàn thành
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In kết quả sau khi các luồng đã thực hiện xong
        System.out.println("Final count: " + example.getCount());
    }

    // Phương thức đồng bộ, chỉ một luồng có thể thực hiện nó tại một thời điểm
    public synchronized void incrementCount() {
        for (int i = 0; i < 1000; i++) {
            count++;  // Tăng giá trị biến count

            // In ra giá trị count để thấy từng bước thực hiện
            System.out.println(Thread.currentThread().getName() + " - count: " + count);

            try {
                Thread.sleep(1);  // Giả lập thời gian chờ giữa các phép tăng
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCount() {
        return count;
    }
}
