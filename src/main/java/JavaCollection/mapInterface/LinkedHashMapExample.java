package JavaCollection.mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Khởi tạo LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm các phần tử
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);

        // In ra map
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("LinkedHashMap contains 'Banana': " + linkedHashMap.containsKey("Banana"));

        // Xóa phần tử
        linkedHashMap.remove("Apple");
        System.out.println("LinkedHashMap after removing 'Apple': " + linkedHashMap);
    }
}
