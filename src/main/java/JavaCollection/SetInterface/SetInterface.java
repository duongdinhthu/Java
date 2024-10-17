package JavaCollection.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {

        // HashSet - Không đảm bảo thứ tự và cho phép chứa 1 phần tử null
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add(null);  // Cho phép thêm phần tử null
        hashSet.add("A");   // Phần tử trùng lặp bị bỏ qua

        System.out.println("HashSet (không đảm bảo thứ tự): " + hashSet);

        System.out.println("=======================================");

        // LinkedHashSet - Duy trì thứ tự thêm vào và cho phép chứa 1 phần tử null
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("X");
        linkedHashSet.add("Y");
        linkedHashSet.add("Z");
        linkedHashSet.add(null);  // Cho phép thêm phần tử null
        linkedHashSet.add("Y");   // Phần tử trùng lặp bị bỏ qua

        System.out.println("LinkedHashSet (duy trì thứ tự): " + linkedHashSet);

        System.out.println("=======================================");

        // TreeSet - Tự động sắp xếp các phần tử và không cho phép chứa phần tử null
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Banana");
        try {
            treeSet.add(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        System.out.println("TreeSet (tự động sắp xếp): " + treeSet);

        System.out.println("=======================================");

        // So sánh giữa các set , kiem tra xem co ton tai hay khong
        System.out.println("HashSet contains 'A': " + hashSet.contains("A"));//
        System.out.println("LinkedHashSet contains 'Y': " + linkedHashSet.contains("Y"));
        System.out.println("TreeSet contains 'Banana': " + treeSet.contains("Banana"));

        // Loại bỏ phần tử trong tung set
        hashSet.remove("B");
        linkedHashSet.remove("X");
        treeSet.remove("Apple");
        // in ra ket qua
        System.out.println("HashSet after removing 'B': " + hashSet);
        System.out.println("LinkedHashSet after removing 'X': " + linkedHashSet);
        System.out.println("TreeSet after removing 'Apple': " + treeSet);
    }
}
