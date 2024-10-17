package JavaCollection.array;

public class Array {
    public static void main(String[] args) {
        // Khai báo mảng kiểu Object để chứa nhiều kiểu dữ liệu khác nhau
        Object[] mixedArray = new Object[4];

        mixedArray[0] = new Dog(1);         // Đối tượng kiểu Dog
        mixedArray[1] = new Cat(2);         // Đối tượng kiểu Cat
        mixedArray[2] = "A String";        // Chuỗi String
        mixedArray[3] = 100;               // Integer (autoboxing từ int)

        // Duyệt qua các phần tử trong mảng và xử lý tùy theo kiểu của chúng
        for (Object obj : mixedArray) {
            if (obj instanceof Animal) {
                Animal animal = (Animal) obj;
                System.out.println(animal);
                animal.sound();  // Gọi phương thức sound() của động vật
            } else {
                System.out.println("Object is: " + obj);
            }
        }
    }
}

class Animal {
    String name = "Animal";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    int age;

    public Dog(int age) {
        super();
        this.age = age;

    }

    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {
    int age;
    public Cat(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }
}