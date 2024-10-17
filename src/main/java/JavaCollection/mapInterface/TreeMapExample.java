package JavaCollection.mapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Khởi tạo TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Thêm các phần tử
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);

        // In ra map
        System.out.println("TreeMap: " + treeMap);

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("TreeMap contains 'Cherry': " + treeMap.containsKey("Cherry"));

        // Xóa phần tử
        treeMap.remove("Banana");
        System.out.println("TreeMap after removing 'Banana': " + treeMap);
    }
}
