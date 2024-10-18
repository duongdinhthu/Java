package DesignPattern;

public class Main {
    public static void main(String[] args) {
        Product productA1 = ProductFactory.createProduct("A", null, null); // Constructor mặc định ProductA
        productA1.display(); // Output: ProductA: ProductA Default, Price: 10.0

        Product productA2 = ProductFactory.createProduct("A", "Custom ProductA", null); // Constructor với tên ProductA
        productA2.display(); // Output: ProductA: Custom ProductA, Price: 15.0

        Product productA3 = ProductFactory.createProduct("A", "Full ProductA", 50.0); // Constructor với tên và giá ProductA
        productA3.display(); // Output: ProductA: Full ProductA, Price: 50.0

        Product productB = ProductFactory.createProduct("B", "Custom ProductB", 35.0); // Constructor với tên và giá ProductB
        productB.display(); // Output: ProductB: Custom ProductB, Price: 35.0

        Product productC = ProductFactory.createProduct("C", null, null); // Constructor mặc định ProductC
        productC.display(); // Output: ProductC: ProductC Default, Price: 30.0
    }
}