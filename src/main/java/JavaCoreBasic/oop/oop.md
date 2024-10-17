1. Các tính chất quan trọng của hướng đối tượng
   Encapsulation (Đóng gói): Là quá trình gói gọn dữ liệu (biến) và các phương thức thao tác với dữ liệu đó lại thành một đơn vị. Nó giúp ẩn các chi tiết thực thi và chỉ cho phép truy cập thông qua các phương thức công khai (getter/setter).

Abstraction (Trừu tượng): Là quá trình ẩn đi những chi tiết không quan trọng và chỉ cung cấp các tính năng cần thiết. Điều này giúp giảm sự phức tạp của hệ thống.

Inheritance (Kế thừa): Là tính chất cho phép một lớp (class) kế thừa các thuộc tính và phương thức của lớp khác, giúp tái sử dụng mã nguồn và giảm sự trùng lặp.

Polymorphism (Đa hình): Là khả năng của một đối tượng có thể có nhiều dạng khác nhau. Đa hình có thể thể hiện qua Overloading (nạp chồng phương thức) và Overriding (ghi đè phương thức).

2. Access modifiers trong Java
   Java có 4 loại Access modifiers:

public: Thành phần có thể được truy cập từ bất kỳ đâu.

protected: Thành phần có thể được truy cập từ lớp hiện tại, lớp con, và các lớp trong cùng một package.

default (không có từ khóa): Thành phần có thể được truy cập từ các lớp trong cùng package.

private: Thành phần chỉ có thể được truy cập từ chính lớp đó.

3. Phân biệt class và instance
   Class: Là bản thiết kế, kiểu dữ liệu của đối tượng, định nghĩa các thuộc tính và phương thức chung.

Instance: Là đối tượng thực tế được tạo ra từ một class. Một class có thể tạo nhiều instances.

4. Phân biệt Abstract và Interface
   Abstract Class:

Có thể chứa cả phương thức đã cài đặt (implemented) và chưa cài đặt (abstract).
Có thể có thuộc tính (fields) và phương thức (methods).
Một class có thể kế thừa một lớp abstract.
Trường hợp sử dụng: Khi bạn muốn tạo một lớp cơ sở với một số phương thức mặc định và các phương thức phải được lớp con cài đặt.
Interface:

Chỉ chứa phương thức chưa cài đặt (chỉ khai báo), không có thuộc tính, chỉ có các phương thức mặc định hoặc static (từ Java 8 trở đi).
Một class có thể triển khai nhiều interface.
Trường hợp sử dụng: Khi bạn muốn các lớp không liên quan đến nhau nhưng có thể có các hành vi chung, ví dụ: Runnable, Comparable.
Trường hợp kế thừa với phương thức cùng tên:

Nếu một lớp kế thừa nhiều interface hoặc một interface và abstract class có phương thức cùng tên, lớp con phải cài đặt phương thức đó.
Nếu kiểu trả về khác nhau, sẽ xảy ra lỗi biên dịch.
5. Overriding và Overloading
   Overloading (Nạp chồng phương thức):

Là việc tạo nhiều phương thức trong cùng một lớp nhưng có tham số khác nhau (số lượng hoặc kiểu dữ liệu khác nhau).
Phương thức vẫn giữ tên như nhau nhưng khác tham số.
Overriding (Ghi đè phương thức):

Là việc lớp con cung cấp lại triển khai (implementation) của phương thức đã được định nghĩa trong lớp cha.




6. Một function có access modifier là private hoặc static có thể overriding được không?
   Private: Không thể override được vì phương thức private chỉ có thể truy cập trong lớp hiện tại, không kế thừa từ lớp khác.

Static: Không phải là phương thức động (non-virtual method), nên không thể gọi là "overriding" mà chỉ có thể gọi là "hiding" (che giấu).







7. Một phương thức final có thể kế thừa được không?
   Phương thức final không thể bị ghi đè (override) trong lớp con, nhưng vẫn có thể kế thừa (inherit).




8. Phân biệt hai từ khóa This và Super
   this: Đại diện cho đối tượng hiện tại, được sử dụng để tham chiếu đến các thuộc tính và phương thức của lớp hiện tại hoặc để phân biệt giữa biến thành viên và tham số của phương thức.

super: Đại diện cho lớp cha, được sử dụng để gọi phương thức hoặc constructor của lớp cha từ lớp con.