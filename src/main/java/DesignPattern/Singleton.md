Singleton Pattern
Mục đích: Đảm bảo chỉ có một thể hiện duy nhất của một lớp.
Triển khai: Dùng constructor private và cung cấp phương thức tĩnh getInstance() để tạo/lấy thể hiện duy nhất.
Ưu điểm: Tiết kiệm tài nguyên, dễ quản lý khi chỉ cần một đối tượng (VD: quản lý kết nối cơ sở dữ liệu, file log).
Trường hợp dùng: Khi cần một đối tượng duy nhất cho toàn bộ ứng dụng (ví dụ: quản lý cấu hình hệ thống).