package DesignPattern;

class ProductC implements Product {
    private String name;
    private double price;

    public ProductC() {
        this.name = "ProductC Default";
        this.price = 30.0;
    }

    @Override
    public void display() {
        System.out.println("ProductC: " + name + ", Price: " + price);
    }
}