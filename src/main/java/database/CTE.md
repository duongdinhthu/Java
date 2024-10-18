4. CTE (Common Table Expression)
   CTE giúp định nghĩa một truy vấn tạm thời mà có thể tham chiếu được nhiều lần trong cùng một câu query.
Nó giúp mã trở nên dễ đọc hơn và có thể thay thế cho các subqueries phức tạp
   WITH EmployeeCTE AS (
   SELECT name, department_id
   FROM employees
   WHERE salary > 50000
   )
   SELECT * FROM EmployeeCTE;



Tách biệt logic: CTE giúp bạn chia nhỏ các phần của câu truy vấn phức tạp, làm cho mã dễ đọc và dễ bảo trì hơn.
Có thể tái sử dụng: Bạn có thể tham chiếu tới CTE nhiều lần trong câu truy vấn chính, tránh phải viết lại logic lặp lại.
Hỗ trợ cho các câu truy vấn phức tạp: CTE rất hữu ích khi bạn muốn làm việc với các truy vấn con phức tạp hoặc dùng nó trong các phép toán đệ quy (recursive queries).



CTE cho phép bạn định nghĩa một bảng tạm thời để sử dụng trong truy vấn chính.
CTE giúp bạn tách biệt logic của câu truy vấn phức tạp và làm cho truy vấn dễ đọc và dễ bảo trì hơn.


CTE tồn tại chỉ trong phạm vi truy vấn hiện tại và sẽ biến mất ngay khi truy vấn kết thúc.
Nó không lưu trữ dữ liệu vào cơ sở dữ liệu và chỉ dùng để cải thiện tính rõ ràng của truy vấn SQL