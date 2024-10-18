Các loại JOIN trong SQL
INNER JOIN: Trả về các bản ghi có sự kết nối giữa bảng này với bảng kia 
(chỉ lấy các bản ghi có giá trị trùng khớp trong cả hai bảng).


LEFT JOIN (hoặc LEFT OUTER JOIN): Trả về tất cả bản ghi từ bảng bên trái và các bản ghi tương ứng từ bảng bên phải. 
Nếu không có kết nối, trả về NULL cho bảng bên phải.


RIGHT JOIN (hoặc RIGHT OUTER JOIN): Trả về tất cả bản ghi từ bảng bên phải và các bản ghi tương ứng từ bảng bên trái. 
Nếu không có kết nối, trả về NULL cho bảng bên trái.


FULL JOIN (hoặc FULL OUTER JOIN):
Trả về tất cả các bản ghi từ cả hai bảng, với các bản ghi không khớp được điền bằng NULL.


CROSS JOIN: Trả về tất cả kết hợp có thể có giữa hai bảng (cartesian product).