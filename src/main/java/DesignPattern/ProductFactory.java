package DesignPattern;

class ProductFactory {
    // Factory method với tham số tùy chỉnh để chọn constructor
    public static Product createProduct(String type, String name, Double price) {
        switch (type) {
            case "A":
                if (name == null && price == null) {
                    return new ProductA(); // Gọi constructor mặc định
                } else if (price == null) {
                    return new ProductA(name); // Gọi constructor với tên
                } else {
                    return new ProductA(name, price); // Gọi constructor với tên và giá
                }
            case "B":
                if (name == null && price == null) {
                    return new ProductB(); // Gọi constructor mặc định
                } else if (price == null) {
                    return new ProductB(name); // Gọi constructor với tên
                } else {
                    return new ProductB(name, price); // Gọi constructor với tên và giá
                }
            case "C":
                return new ProductC(); // Gọi constructor mặc định cho ProductC
            default:
                throw new IllegalArgumentException("Unknown product type.");
        }
    }
}