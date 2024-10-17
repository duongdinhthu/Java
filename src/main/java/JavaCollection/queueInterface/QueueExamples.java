package JavaCollection.queueInterface;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueExamples {

    public static void main(String[] args) {
        // ------------------- LinkedList Queue Example -------------------
        System.out.println("---------- LinkedList Queue Example ----------");
        Queue<String> linkedListQueue = new LinkedList<>();  // Queue với cấu trúc danh sách liên kết

        // Thêm phần tử vào hàng đợi
        linkedListQueue.offer("Alice");
        linkedListQueue.offer("Bob");
        linkedListQueue.offer("Charlie");

        // Hiển thị Queue
        System.out.println("LinkedList Queue: " + linkedListQueue);

        // Loại bỏ và hiển thị phần tử đầu tiên
        System.out.println("Loại bỏ phần tử: " + linkedListQueue.poll());
        System.out.println("Queue sau khi loại bỏ: " + linkedListQueue);

        // Đặc điểm của LinkedList Queue:
        // - Sử dụng cấu trúc danh sách liên kết, có thể dễ dàng thêm và loại bỏ phần tử ở đầu hoặc cuối.
        // - Thao tác nhanh ở đầu và cuối nhưng truy cập ngẫu nhiên chậm hơn.

        // ------------------- PriorityQueue Example -------------------
        System.out.println("\n---------- PriorityQueue Example ----------");
        Queue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());  // Sắp xếp theo độ dài chuỗi
            }
        });
        // Thêm phần tử vào hàng đợi với ưu tiên
        priorityQueue.offer("Charlie");
        priorityQueue.offer("Alice");
        priorityQueue.offer("Bob");

        // Hiển thị Queue (sẽ theo thứ tự ưu tiên tự nhiên)
        System.out.println("PriorityQueue: " + priorityQueue);

        // Loại bỏ và hiển thị phần tử ưu tiên cao nhất
        System.out.println("Loại bỏ phần tử với ưu tiên cao nhất: " + priorityQueue.poll());
        System.out.println("Queue sau khi loại bỏ: " + priorityQueue);

        // Đặc điểm của PriorityQueue:
        // - Phần tử được sắp xếp tự động theo thứ tự ưu tiên (dựa trên thứ tự tự nhiên hoặc comparator).
        // - Không đảm bảo thứ tự thêm vào; các phần tử có thể không được xử lý theo thứ tự thêm vào.

        // ------------------- ArrayBlockingQueue Example -------------------
        System.out.println("\n---------- ArrayBlockingQueue Example ----------");
        Queue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);  // Hàng đợi với kích thước cố định

        // Thêm phần tử vào hàng đợi
        arrayBlockingQueue.offer("Alice");
        arrayBlockingQueue.offer("Bob");
        arrayBlockingQueue.offer("Charlie");

        // Hiển thị ArrayBlockingQueue
        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);

        // Loại bỏ và hiển thị phần tử đầu tiên
        System.out.println("Loại bỏ phần tử: " + arrayBlockingQueue.poll());
        System.out.println("ArrayBlockingQueue sau khi loại bỏ: " + arrayBlockingQueue);

        // Đặc điểm của ArrayBlockingQueue:
        // - Hàng đợi có kích thước cố định, giúp quản lý tài nguyên trong môi trường đa luồng.
        // - Khi hàng đợi đầy, các thao tác offer() sẽ bị block hoặc từ chối, giúp kiểm soát bộ nhớ hiệu quả.

        // ------------------- ConcurrentLinkedQueue Example -------------------
        System.out.println("\n---------- ConcurrentLinkedQueue Example ----------");
        Queue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();  // Hàng đợi bất đồng bộ, an toàn trong môi trường đa luồng

        // Thêm phần tử vào hàng đợi
        concurrentLinkedQueue.offer("Alice");
        concurrentLinkedQueue.offer("Bob");
        concurrentLinkedQueue.offer("Charlie");

        // Hiển thị ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + concurrentLinkedQueue);

        // Loại bỏ và hiển thị phần tử đầu tiên
        System.out.println("Loại bỏ phần tử: " + concurrentLinkedQueue.poll());
        System.out.println("ConcurrentLinkedQueue sau khi loại bỏ: " + concurrentLinkedQueue);

        // Đặc điểm của ConcurrentLinkedQueue:
        // - Hàng đợi không đồng bộ, an toàn trong môi trường đa luồng, không cần đồng bộ hóa khi thêm hoặc loại bỏ phần tử.
        // - Phù hợp với các hệ thống cần xử lý đồng thời và không cần khóa đồng bộ (lock-free).
    }
}
