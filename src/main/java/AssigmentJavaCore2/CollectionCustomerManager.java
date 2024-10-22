package AssigmentJavaCore2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.regex.Pattern;

public class CollectionCustomerManager {
    private static final String FILE_PATH = "D:/JV/JavaTASC/src/main/java/AssigmentJavaCore2/fake_customers.json";
    private static List<Customer> customers = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static String collectionType;

    public static void main(String[] args) {
        System.out.println("Chọn loại collection:");
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Vector");
        System.out.println("4. Stack");
        System.out.println("5. HashMap");
        System.out.println("6. TreeMap");
        System.out.println("7. LinkedHashMap");
        System.out.println("8. HashSet");
        System.out.println("9. TreeSet");
        System.out.println("10. LinkedHashSet");
        System.out.println("11. ArrayDeque");
        System.out.println("12. LinkedList (Queue)");

        int collectionChoice = Integer.parseInt(scanner.nextLine());
        switch (collectionChoice) {
            case 1:
                collectionType = "ArrayList";
                customers = new ArrayList<>();
                break;
            case 2:
                collectionType = "LinkedList";
                customers = new LinkedList<>();
                break;
            case 3:
                collectionType = "Vector";
                customers = new Vector<>();
                break;
            case 4:
                collectionType = "Stack";
                customers = new Stack<>();
                break;
            case 5:
                collectionType = "HashMap";
                // Implement logic for HashMap
                break;
            case 6:
                collectionType = "TreeMap";
                // Implement logic for TreeMap
                break;
            case 7:
                collectionType = "LinkedHashMap";
                // Implement logic for LinkedHashMap
                break;
            case 8:
                collectionType = "HashSet";
                // Implement logic for HashSet
                break;
            case 9:
                collectionType = "TreeSet";
                // Implement logic for TreeSet
                break;
            case 10:
                collectionType = "LinkedHashSet";
                // Implement logic for LinkedHashSet
                break;
            case 11:
                collectionType = "ArrayDeque";
                // Implement logic for ArrayDeque
                break;
            case 12:
                collectionType = "LinkedList (Queue)";
                // Implement logic for LinkedList (Queue)
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }

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
        long startTime = System.currentTimeMillis();

        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            Type customerListType = new TypeToken<List<Customer>>() {}.getType();
            customers = gson.fromJson(reader, customerListType);
            System.out.println("Đã tải " + customers.size() + " khách hàng từ file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thời gian ghi dữ liệu từ file vào collection :"+ collectionType + ". Thời gian: " + (endTime - startTime) + " ms");
    }

    private static void displayCustomers() {
        long startTime = System.currentTimeMillis();

        for (Customer customer : customers) {
            System.out.println(customer);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("thời gian đọc dữ liệu :"+ collectionType + ". Thời gian: " + (endTime - startTime) + " ms");
    }

    private static void saveCustomer() {
        System.out.println("Nhập số lượng khách hàng cần thêm:");
        int n = Integer.parseInt(scanner.nextLine());
        long startTime = System.currentTimeMillis();

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

        long endTime = System.currentTimeMillis();
        System.out.println("Đã thêm " + n + " khách hàng thành công vào " + collectionType + ". Thời gian: " + (endTime - startTime) + " ms");
    }

    private static void searchCustomer() {
        String phoneNumber = getInput("Nhập số điện thoại cần tìm: ");
        long startTime = System.currentTimeMillis();

        for (Customer customer : customers) {
            if (customer.phoneNumber.equals(phoneNumber)) {
                System.out.println(customer);
                long endTime = System.currentTimeMillis();
                System.out.println("Thời gian tìm kiếm: " + (endTime - startTime) + " ms");
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng nào với số điện thoại " + phoneNumber);
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian tìm kiếm: " + (endTime - startTime) + " ms");
    }

    private static void editCustomer() {
        String phoneNumber = getInput("Nhập số điện thoại khách hàng cần chỉnh sửa: ");
        long startTime = System.currentTimeMillis();

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
                long endTime = System.currentTimeMillis();
                System.out.println("Thời gian chỉnh sửa: " + (endTime - startTime) + " ms");
                return;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Không tìm thấy khách hàng nào với số điện thoại " + phoneNumber);
        System.out.println("Thời gian tìm kiếm: " + (endTime - startTime) + " ms");
    }

    private static void deleteCustomer() {
        String phoneNumber = getInput("Nhập số điện thoại khách hàng cần xóa: ");
        long startTime = System.currentTimeMillis();

        customers.removeIf(customer -> customer.phoneNumber.equals(phoneNumber));
        System.out.println("Khách hàng với số điện thoại " + phoneNumber + " đã được xóa.");

        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian xóa: " + (endTime - startTime) + " ms");
    }

    private static void saveToFile() {
        long startTime = System.currentTimeMillis();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(customers, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian save vào lại file json: " + (endTime - startTime) + " ms");
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
