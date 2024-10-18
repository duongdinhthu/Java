package DesignPattern;

class ProductB implements Product {
    private String name;
    private double price;

    public ProductB() {
        this.name = "ProductB Default";
        this.price = 20.0;
    }

    public ProductB(String name) {
        this.name = name;
        this.price = 25.0;
    }

    public ProductB(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("ProductB: " + name + ", Price: " + price);
    }
}