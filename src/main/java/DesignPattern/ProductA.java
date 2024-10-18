package DesignPattern;

class ProductA implements Product {
    private String name;
    private double price;

    public ProductA() {
        this.name = "ProductA Default";
        this.price = 10.0;
    }

    public ProductA(String name) {
        this.name = name;
        this.price = 15.0;
    }

    public ProductA(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("ProductA: " + name + ", Price: " + price);
    }
}