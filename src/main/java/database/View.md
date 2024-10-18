VIEW là gì?
VIEW là một bảng ảo, được tạo ra từ một truy vấn SQL.
Nó không lưu trữ dữ liệu mà chỉ lưu trữ câu lệnh truy vấn để mỗi khi bạn cần, nó sẽ truy vấn lại dữ liệu từ các bảng gốc để trả về kết quả.
VIEW giúp bạn truy vấn dữ liệu dễ dàng hơn từ nhiều bảng hoặc với một logic phức tạp mà không phải viết lại truy vấn đó nhiều lần.

VIEW chủ yếu dùng để xem (SELECT) dữ liệu từ các bảng, giúp đơn giản hóa các truy vấn phức tạp và cải thiện bảo mật.
Có thể dùng để thực hiện CRUD trong một số trường hợp đặc biệt, nhưng cần phải thận trọng vì không phải lúc nào VIEW cũng hỗ trợ các thao tác này một cách rõ ràng và an toàn.




CRUD trên VIEW có thể thực hiện được không?

Để một VIEW trở thành updatable (có thể cập nhật được), tức là bạn có thể thực hiện các thao tác INSERT, UPDATE, và DELETE trên VIEW và các thay đổi này sẽ được phản ánh vào các bảng gốc, VIEW phải đáp ứng một số điều kiện nhất định.

Điều kiện để VIEW là Updatable
VIEW chỉ dựa trên một bảng duy nhất:

VIEW phải đại diện cho một bảng duy nhất, nghĩa là bạn không thể sử dụng JOIN, UNION, hoặc các phép kết hợp khác với nhiều bảng trong một VIEW.
Nếu VIEW truy vấn từ nhiều bảng, hệ quản trị cơ sở dữ liệu (DBMS) sẽ không biết làm thế nào để thực hiện các thao tác thay đổi dữ liệu một cách rõ ràng.
Không có các hàm tổng hợp (Aggregate functions):

Các hàm như SUM(), COUNT(), MAX(), MIN(), AVG()... thường không cho phép thực hiện thao tác cập nhật trên VIEW. Nếu VIEW chứa bất kỳ hàm tổng hợp nào, thì nó sẽ không phải là updatable.


Không có DISTINCT hoặc GROUP BY:





Thực tế, VIEW chủ yếu được sử dụng để truy vấn dữ liệu (SELECT) và làm việc với dữ liệu dễ dàng hơn, chứ không phải để thực hiện các thao tác INSERT, UPDATE, hoặc DELETE. Tuy nhiên, VIEW có thể hữu ích trong một số trường hợp khi bạn muốn:

1. Sử dụng VIEW chủ yếu để xem dữ liệu:
   Đơn giản hóa truy vấn phức tạp: Nếu bạn có các truy vấn phức tạp mà cần phải truy vấn nhiều bảng, sử dụng các phép toán như JOIN, GROUP BY, hay các hàm tổng hợp, bạn có thể đóng gói các truy vấn đó vào một VIEW. Sau đó, bạn chỉ cần SELECT từ VIEW thay vì phải viết lại toàn bộ truy vấn phức tạp.
   Tăng cường bảo mật: Khi bạn không muốn người dùng trực tiếp truy cập vào bảng gốc, bạn có thể tạo một VIEW chứa một phần dữ liệu nhất định từ bảng gốc để chỉ cho phép người dùng truy vấn dữ liệu này. Điều này có thể giúp giới hạn quyền truy cập.
   Lọc dữ liệu: Bạn có thể tạo VIEW để chỉ lấy các bản ghi thỏa mãn một điều kiện nào đó mà không cần phải thực hiện lại câu truy vấn mỗi lần.


Nếu bạn sử dụng DISTINCT hoặc GROUP BY trong VIEW, nó sẽ làm cho VIEW không còn updatable, vì không thể xác định bản ghi gốc trong bảng.
Không sử dụng JOIN với bảng khác:

Nếu VIEW liên kết với nhiều bảng qua JOIN, việc xác định bản ghi để cập nhật hoặc xóa sẽ trở nên mơ hồ, làm cho VIEW không thể updatable.
Không có UNION hoặc UNION ALL:

Nếu VIEW sử dụng UNION hoặc UNION ALL để kết hợp dữ liệu từ nhiều truy vấn, bạn cũng không thể thực hiện các thao tác thay đổi trên VIEW.
UNION và UNION ALL có thể trả về nhiều bản ghi từ các bảng khác nhau, khiến cho việc xác định bản ghi gốc gặp khó khăn.
Không có Subqueries trong WHERE hoặc FROM:

Nếu VIEW chứa subquery trong các phần như WHERE hoặc FROM, việc thực hiện CRUD sẽ không khả thi.
Không sử dụng ORDER BY trong VIEW:

ORDER BY chỉ ảnh hưởng đến thứ tự của kết quả trả về, nhưng trong các hệ cơ sở dữ liệu, việc sử dụng ORDER BY trong VIEW sẽ làm cho VIEW không thể thực hiện các thao tác thay đổi vì thứ tự bản ghi không thể xác định rõ ràng.


