package JavaCollection.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Khởi tạo HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        // In ra map
        System.out.println("HashMap: " + hashMap);

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("HashMap contains 'Apple': " + hashMap.containsKey("Apple"));

        // Xóa phần tử
        hashMap.remove("Banana");
        System.out.println("HashMap after removing 'Banana': " + hashMap);
    }
}
