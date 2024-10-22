package AssigmentJavaCore2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateData {

    private static final String FILE_PATH = "D:/JV/JavaTASC/src/main/java/AssigmentJavaCore2/fake_customers.json";
    private static final int NUMBER_OF_CUSTOMERS = 100000;

    public static void main(String[] args) {
        List<Customer> fakeCustomers = generateFakeCustomers(NUMBER_OF_CUSTOMERS);
        saveToFile(fakeCustomers);
    }

    private static List<Customer> generateFakeCustomers(int numberOfCustomers) {
        List<Customer> fakeCustomers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfCustomers; i++) {
            String name = "Khách hàng " + (i + 1);
            String email = "customer" + (i + 1) + "@example.com";
            String phoneNumber = String.format("%010d", random.nextInt(1000000000));

            fakeCustomers.add(new Customer(name, email, phoneNumber));
        }

        return fakeCustomers;
    }

    private static void saveToFile(List<Customer> customers) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(customers, writer);
            System.out.println("Đã lưu " + customers.size() + " khách hàng giả vào file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
