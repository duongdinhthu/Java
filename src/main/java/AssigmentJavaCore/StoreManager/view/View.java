package AssigmentJavaCore.StoreManager.view;

import AssigmentJavaCore.StoreManager.controller.Controller;
import AssigmentJavaCore.StoreManager.entity.Customer;
import AssigmentJavaCore.StoreManager.model.Model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);
    private final Controller<Customer> customerController;

    public View() {
        Model<Customer> model = new Model<>();
        this.customerController = new Controller<>(model);
    }

    // Hiển thị danh sách khách hàng
    public void showCustomers() {
        try {
            List<Customer> customers = customerController.list(new Customer());
            if (customers.isEmpty()) {
                System.out.println("Không có khách hàng nào.");
            } else {
                customers.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi hiển thị danh sách khách hàng: " + e.getMessage());
        }
    }

    // Thêm khách hàng mới
    public void addCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng khách hàng cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i + 1) + ":");

            System.out.print("Họ: ");
            String firstName = sc.nextLine();

            System.out.print("Tên: ");
            String lastName = sc.nextLine();

            String email = inputValidEmail(sc);
            String phone = inputValidPhoneNumber(sc);

            // Tạo đối tượng Customer
            Customer customer = new Customer(firstName, lastName, email, phone);

            try {
                customerController.insert(customer);
                System.out.println("Thêm khách hàng thành công.");
            } catch (SQLException | IllegalAccessException e) {
                System.out.println("Lỗi khi thêm khách hàng: " + e.getMessage());
            }
        }
    }

    // Tìm kiếm khách hàng theo số điện thoại
    public void searchCustomerByPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại của khách hàng: ");
        String phone = sc.nextLine();

        try {
            Customer customer = new Customer();
            customer.setPhone(phone);

            List<Customer> foundCustomers = customerController.getEntityByField(customer);
            if (foundCustomers.isEmpty()) {
                System.out.println("Không tìm thấy khách hàng với số điện thoại: " + phone);
            } else {
                foundCustomers.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm kiếm khách hàng: " + e.getMessage());
        }
    }

    // Cập nhật thông tin khách hàng
    public void editCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại của khách hàng cần chỉnh sửa: ");
        String phone = sc.nextLine();
        sc.nextLine(); // Consume newline

        try {
            Customer customer = new Customer();
            customer.setPhone(phone);

            List<Customer> foundCustomers = customerController.getEntityByField(customer);
            if (foundCustomers.isEmpty()) {
                System.out.println("Không tìm thấy khách hàng với số điện thoại: " + phone);
                return;
            }

            Customer existingCustomer = foundCustomers.get(0); // Assuming phone number is unique
            System.out.println("Thông tin khách hàng hiện tại: " + existingCustomer);

            System.out.println("Nhập thông tin mới (bỏ qua nếu không muốn thay đổi):");
            System.out.print("Họ mới: ");
            String newFirstName = sc.nextLine();
            if (!newFirstName.isEmpty()) {
                existingCustomer.setFirst_name(newFirstName);
            }

            System.out.print("Tên mới: ");
            String newLastName = sc.nextLine();
            if (!newLastName.isEmpty()) {
                existingCustomer.setLast_name(newLastName);
            }

            System.out.print("Email mới: ");
            String newEmail = sc.nextLine();
            if (!newEmail.isEmpty() && isValidEmail(newEmail)) {
                existingCustomer.setEmail(newEmail);
            }

            System.out.print("Số điện thoại mới: ");
            String phoneInput = sc.nextLine();
            if (!phoneInput.isEmpty() && isValidPhone(phoneInput)) {
                existingCustomer.setPhone(phoneInput);
            }

            customerController.update(existingCustomer);
            System.out.println("Cập nhật thông tin khách hàng thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi khi chỉnh sửa thông tin khách hàng: " + e.getMessage());
        }
    }

    // Xóa khách hàng
    public void deleteCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại của khách hàng cần xóa: ");
        String phone = sc.nextLine();

        try {
            Customer customer = new Customer();
            customer.setPhone(phone);

            List<Customer> foundCustomers = customerController.getEntityByField(customer);
            if (foundCustomers.isEmpty()) {
                System.out.println("Không tìm thấy khách hàng với số điện thoại: " + phone);
                return;
            }

            customerController.delete(foundCustomers.get(0));
            System.out.println("Xóa khách hàng thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa khách hàng: " + e.getMessage());
        }
    }

    // Hàm kiểm tra email hợp lệ
    private String inputValidEmail(Scanner sc) {
        String email;
        while (true) {
            System.out.print("Nhập email: ");
            email = sc.nextLine();
            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                break;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }
        return email;
    }

    // Hàm kiểm tra số điện thoại hợp lệ
    private String inputValidPhoneNumber(Scanner sc) {
        String phone;
        while (true) {
            System.out.print("Nhập số điện thoại (10 chữ số): ");
            phone = sc.nextLine();
            if (String.valueOf(phone).length() == 10) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }
        return phone;
    }

    // Kiểm tra số điện thoại có bị trùng không
    private boolean isPhoneDuplicate(String phone) {
        try {
            Customer customer = new Customer();
            customer.setPhone(phone);
            List<Customer> customers = customerController.getEntityByField(customer);
            return !customers.isEmpty();
        } catch (Exception e) {
            System.out.println("Lỗi kiểm tra trùng số điện thoại: " + e.getMessage());
        }
        return false;
    }

    // Kiểm tra email hợp lệ
    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    // Kiểm tra số điện thoại hợp lệ
    private boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }
}
