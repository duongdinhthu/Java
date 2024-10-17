1. static
   static là một từ khóa trong Java, dùng để khai báo các thành phần (thuộc tính, phương thức, khối lệnh) thuộc về lớp thay vì đối tượng của lớp đó. Điều này có nghĩa là các thành phần này sẽ tồn tại và có giá trị chung cho tất cả các đối tượng của lớp đó.

Khi nào sử dụng static:

Khi bạn cần một thuộc tính hoặc phương thức có giá trị chung cho tất cả các đối tượng của lớp. Ví dụ, bạn muốn đếm số đối tượng được tạo ra từ một lớp, hoặc khi bạn có một phương thức không cần phụ thuộc vào trạng thái của đối tượng.
Các phương thức static không thể truy cập được các biến hoặc phương thức không static (cần phải thông qua đối tượng).
Truy cập phương thức, thuộc tính static:

Bạn có thể truy cập trực tiếp một phương thức hoặc thuộc tính static thông qua tên lớp mà không cần phải tạo một đối tượng

2. final
   final là từ khóa trong Java dùng để khai báo các thành phần (biến, phương thức, lớp) không thể thay đổi giá trị (biến) hoặc kế thừa (lớp), hoặc ghi đè (phương thức).

Sự khác biệt giữa final và static:

final: Được dùng khi bạn muốn đảm bảo giá trị của một biến không thay đổi sau khi được khởi tạo (biến final không thể gán lại giá trị).
static: Là để khai báo thuộc tính hoặc phương thức chung cho tất cả các đối tượng của lớp.
Một biến có thể vừa là final vừa là static, điều này có nghĩa là giá trị của nó sẽ được cố định và dùng chung cho tất cả các đối tượng.
Biến final có thể chỉnh sửa không?

Biến final không thể chỉnh sửa sau khi đã được gán giá trị ban đầu. Đây là điểm khác biệt chính giữa final và static.