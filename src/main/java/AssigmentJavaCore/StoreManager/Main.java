package AssigmentJavaCore.StoreManager;

import AssigmentJavaCore.StoreManager.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        View customerView = new View();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== Menu =====");
            System.out.println("1. Xem danh sách khách hàng");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Tìm kiếm khách hàng theo số điện thoại");
            System.out.println("4. Chỉnh sửa thông tin khách hàng");
            System.out.println("5. Xóa khách hàng");
            System.out.println("6. Thoát");
            System.out.print("Chọn một chức năng (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    customerView.showCustomers();
                    break;
                case 2:
                    customerView.addCustomer();
                    break;
                case 3:
                    customerView.searchCustomerByPhone();
                    break;
                case 4:
                    customerView.editCustomer();
                    break;
                case 5:
                    customerView.deleteCustomer();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }

        scanner.close();
    }
}
