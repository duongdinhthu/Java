Singleton và Factory Method là hai design pattern phổ biến trong lập trình hướng đối tượng. Chúng có các mục đích và cách triển khai khác nhau, nhưng đều giúp tăng tính linh hoạt và bảo trì của hệ thống. Dưới đây là chi tiết về từng pattern cùng với ví dụ minh họa bằng Java.

1. Singleton Pattern
   Mục đích:
   Singleton pattern đảm bảo rằng một lớp chỉ có một thể hiện duy nhất, và cung cấp một điểm truy cập toàn cục tới thể hiện đó.

Cách triển khai:
Tạo một lớp với một hàm khởi tạo private để ngăn không cho lớp này bị khởi tạo từ bên ngoài.
Sử dụng một phương thức tĩnh để kiểm tra xem thể hiện của lớp đã tồn tại chưa. Nếu chưa, phương thức này sẽ tạo một thể hiện, và nếu đã tồn tại, nó sẽ trả về thể hiện đó.
Ưu điểm:
Đảm bảo chỉ có một đối tượng duy nhất tồn tại trong toàn bộ chương trình, giúp tiết kiệm bộ nhớ và dễ quản lý hơn.
Kiểm soát việc truy cập tới đối tượng duy nhất, có thể dùng trong các trường hợp quản lý tài nguyên như kết nối cơ sở dữ liệu, file log, v.v.


2. Factory Method Pattern
   Mục đích:
   Factory Method pattern cung cấp một giao diện để tạo đối tượng nhưng để các lớp con quyết định đối tượng nào sẽ được tạo. Factory Method giúp chương trình không bị phụ thuộc vào các lớp cụ thể mà có thể mở rộng dễ dàng.

Cách triển khai:
Tạo một lớp có phương thức tĩnh gọi là factory method, phương thức này sẽ trả về các đối tượng dựa trên các điều kiện hoặc tham số đầu vào.
Các lớp con có thể ghi đè phương thức này để trả về các đối tượng cụ thể của chúng.
Ưu điểm:
Cung cấp tính linh hoạt và dễ mở rộng khi muốn thêm các đối tượng mới mà không thay đổi mã gốc.
Loại bỏ sự phụ thuộc vào các lớp cụ thể, giúp mã dễ bảo trì hơn.