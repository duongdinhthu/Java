package JavaCollection.mapInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Khởi tạo Hashtable
        Map<String, Integer> hashtable = new Hashtable<>();

        // Thêm các phần tử
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);

        // In ra map
        System.out.println("Hashtable: " + hashtable);

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("Hashtable contains 'Apple': " + hashtable.containsKey("Apple"));

        // Xóa phần tử
        hashtable.remove("Cherry");
        System.out.println("Hashtable after removing 'Cherry': " + hashtable);
    }
}
