package AssigmentJavaCore2;

public class Customer {
    String name;     // Tên khách hàng
    String email;    // Email khách hàng
    String phoneNumber; // Số điện thoại

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
