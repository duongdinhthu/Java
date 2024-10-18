1. Thứ tự thực hiện của các thành phần trong câu query SQL
   Khi SQL thực hiện một câu query, thứ tự thực hiện của các thành phần trong câu query không phải luôn theo thứ tự viết trong câu lệnh. Dưới đây là thứ tự thực hiện của các thành phần trong SQL:

FROM: Chọn bảng (hoặc các bảng, subquery) để lấy dữ liệu.
ON: Áp dụng điều kiện kết nối (dùng trong JOIN).
JOIN: Kết nối các bảng lại với nhau.
WHERE: Lọc dữ liệu dựa trên điều kiện.
GROUP BY: Nhóm các bản ghi lại.
HAVING: Lọc nhóm dữ liệu sau khi đã nhóm.
SELECT: Chọn các cột dữ liệu cần hiển thị.
DISTINCT: Loại bỏ các bản ghi trùng lặp.
ORDER BY: Sắp xếp kết quả theo thứ tự.
LIMIT / OFFSET: Giới hạn số lượng kết quả trả về.