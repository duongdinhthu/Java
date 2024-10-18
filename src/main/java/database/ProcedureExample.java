package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class ProcedureExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assigmentjavacore", "root", "");

            // Gọi procedure
            CallableStatement stmt = conn.prepareCall("{CALL GetCustomerById(?)}");
            stmt.setInt(1, 1); // Thay "1" bằng ID bạn muốn lấy thông tin

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Customer ID: " + rs.getInt("customer_id"));
                System.out.println("First Name: " + rs.getString("first_name"));
                System.out.println("Last Name: " + rs.getString("last_name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Phone: " + rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
