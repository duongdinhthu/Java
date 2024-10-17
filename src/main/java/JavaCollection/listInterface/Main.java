package JavaCollection.listInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean a = true;  // Cờ để điều khiển vòng lặp

        ListInterface list = new ListInterface();
        Scanner scanner = new Scanner(System.in);  // Scanner để nhập dữ liệu từ bàn phím

        // Hiển thị danh sách ban đầu khi chưa có phần tử
        System.out.println("List khi chưa thêm phần tử:");
        list.listInterFace();  // Sửa lại để hiển thị danh sách

        // Thêm phần tử vào danh sách
        System.out.println("List khi đã thêm phần tử:");
        list.listInterfaceAdd();
        list.listInterFace();

        // Vòng lặp để liên tục hỏi người dùng cho đến khi họ chọn thoát
        while (a) {
            System.out.println("\nNhập lựa chọn của bạn:");
            System.out.println("1: Lấy phần tử theo index");
            System.out.println("2: Thêm phần tử khác");
            System.out.println("3: Xóa tất cả phần tử");
            System.out.println("0: Thoát");

            int choice = scanner.nextInt();  // Nhập lựa chọn từ người dùng

            switch (choice) {
                case 1:
                    System.out.print("Nhập index của phần tử muốn lấy: ");
                    int index = scanner.nextInt();
                    Object element = list.listInterfaceGet(index);  // Lấy phần tử tại index
                    System.out.println("Phần tử tại index " + index + ": " + element);
                    break;
                case 2:
                    // Ví dụ thêm phần tử khác
                    System.out.print("Nhập chuỗi để thêm: ");
                    String newElement = scanner.next();
                    list.listInterfaceAdd(newElement);
                    list.listInterFace();  // Hiển thị lại danh sách sau khi xóa
                    break;
                case 3:
                    // Xóa tất cả phần tử
                    list.listInterfaceRemove();
                    System.out.println("Đã xóa tất cả phần tử.");
                    list.listInterFace();  // Hiển thị lại danh sách sau khi xóa
                    break;
                case 0:
                    // Thoát chương trình
                    a = false;  // Đặt cờ để thoát khỏi vòng lặp
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }

        scanner.close();  // Đóng scanner sau khi sử dụng
    }
}
