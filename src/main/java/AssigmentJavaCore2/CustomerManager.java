package AssigmentJavaCore2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerManager {

    private static final String FILE_PATH = "D:/JV/JavaTASC/src/main/java/AssigmentJavaCore2/fake_customers.json";
    private static List<Customer> customers = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadCustomers();
        boolean running = true;
        while (running) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Xem thông tin khách hàng");
            System.out.println("2. Lưu thông tin khách hàng");
            System.out.println("3. Tìm kiếm khách hàng theo số điện thoại");
            System.out.println("4. Chỉnh sửa thông tin khách hàng");
            System.out.println("5. Xóa thông tin khách hàng");
            System.out.println("0. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayCustomers();
                    break;
                case 2:
                    saveCustomer();
                    break;
                case 3:
                    searchCustomer();
                    break;
                case 4:
                    editCustomer();
                    break;
                case 5:
                    deleteCustomer();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        saveToFile();
        System.out.println("Đã lưu tất cả thay đổi vào file.");
    }

    private static void loadCustomers() {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            Type customerListType = new TypeToken<List<Customer>>() {}.getType();
            customers = gson.fromJson(reader, customerListType);
            System.out.println("Đã tải " + customers.size() + " khách hàng từ file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private static void saveCustomer() {
        System.out.println("Nhập số lượng khách hàng cần thêm:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = getInput("Tên khách hàng: ");
            String email = getInput("Email khách hàng: ");
            String phoneNumber = getInput("Số điện thoại (10 số): ");
            while (!isValidPhoneNumber(phoneNumber) || isPhoneNumberExists(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ hoặc đã tồn tại. Vui lòng nhập lại.");
                phoneNumber = getInput("Số điện thoại (10 số): ");
            }
            customers.add(new Customer(name, email, phoneNumber));
        }
    }

    private static void searchCustomer() {
        String phoneNumber = getInput("Nhập số điện thoại cần tìm: ");
        for (Customer customer : customers) {
            if (customer.phoneNumber.equals(phoneNumber)) {
                System.out.println(customer);
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng nào với số điện thoại " + phoneNumber);
    }

    private static void editCustomer() {
        String phoneNumber = getInput("Nhập số điện thoại khách hàng cần chỉnh sửa: ");
        for (Customer customer : customers) {
            if (customer.phoneNumber.equals(phoneNumber)) {
                System.out.println("Nhập thông tin mới (nhấn Enter để giữ nguyên): ");
                String name = getInput("Tên khách hàng (hiện tại: " + customer.name + "): ");
                String email = getInput("Email khách hàng (hiện tại: " + customer.email + "): ");
                String newPhoneNumber = getInput("Số điện thoại (hiện tại: " + customer.phoneNumber + "): ");

                // Nếu người dùng không nhập gì, giữ nguyên thông tin cũ
                customer.name = name.isEmpty() ? customer.name : name;
                customer.email = email.isEmpty() ? customer.email : email;
                if (!newPhoneNumber.isEmpty()) {
                    while (!isValidPhoneNumber(newPhoneNumber) || isPhoneNumberExists(newPhoneNumber)) {
                        System.out.println("Số điện thoại không hợp lệ hoặc đã tồn tại. Vui lòng nhập lại.");
                        newPhoneNumber = getInput("Số điện thoại (10 số): ");
                    }
                    customer.phoneNumber = newPhoneNumber;
                }
                System.out.println("Thông tin khách hàng đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng nào với số điện thoại " + phoneNumber);
    }

    private static void deleteCustomer() {
        String phoneNumber = getInput("Nhập số điện thoại khách hàng cần xóa: ");
        customers.removeIf(customer -> customer.phoneNumber.equals(phoneNumber));
        System.out.println("Khách hàng với số điện thoại " + phoneNumber + " đã được xóa.");
    }

    private static void saveToFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(customers, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\d{10}", phoneNumber);
    }

    private static boolean isPhoneNumberExists(String phoneNumber) {
        return customers.stream().anyMatch(c -> c.phoneNumber.equals(phoneNumber));
    }
}
