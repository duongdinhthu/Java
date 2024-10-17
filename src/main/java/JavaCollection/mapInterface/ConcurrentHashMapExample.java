package JavaCollection.mapInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Khởi tạo ConcurrentHashMap
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Thêm các phần tử
        concurrentHashMap.put("Apple", 1);
        concurrentHashMap.put("Banana", 2);
        concurrentHashMap.put("Cherry", 3);

        // In ra map
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("ConcurrentHashMap contains 'Banana': " + concurrentHashMap.containsKey("Banana"));

        // Xóa phần tử
        concurrentHashMap.remove("Apple");
        System.out.println("ConcurrentHashMap after removing 'Apple': " + concurrentHashMap);
    }
}
