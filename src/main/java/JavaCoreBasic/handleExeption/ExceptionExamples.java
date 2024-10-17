package JavaCoreBasic.handleExeption;

import java.io.*;

// Custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExamples {

    // Phương thức ném checked exception (throws)
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Tuổi phải từ 18 trở lên."); // Ném exception (throw)
        }
        System.out.println("Tuổi hợp lệ.");
    }

    // Phương thức ném checked exception (throws)
    public void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        System.out.println(line);
        reader.close(); // Đóng tài nguyên thủ công trong try-catch
    }

    public void demoUncheckedException() {
        try {
            int result = 10 / 0; // Gây ra Unchecked Exception (ArithmeticException)
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0!"); // Xử lý lỗi
        }
    }

    public static void main(String[] args) {
        ExceptionExamples obj = new ExceptionExamples();

        // Sử dụng try-catch để xử lý checked exception
        try {
            obj.checkAge(16); // Ném custom exception vì tuổi < 18
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()); // Xử lý custom exception
        }

        // Sử dụng try-catch để xử lý checked exception (IOException)
        try {
            obj.readFile("non_existing_file.txt"); // File không tồn tại
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }

        // Sử dụng try-with-resources để tự động quản lý tài nguyên
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            // Không cần gọi br.close() vì try-with-resources tự động đóng tài nguyên
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file trong try-with-resources");
        }

        // Demo Unchecked Exception
        obj.demoUncheckedException(); // Gây lỗi chia cho 0 (unchecked)
    }
}
