Các hàm Window Functions trong SQL như ROW_NUMBER, RANK, và DENSE_RANK được dùng để đánh số thứ tự cho các bản ghi trong một tập hợp dữ liệu, dựa trên một số tiêu chí sắp xếp. Tuy nhiên, cách xử lý các trường hợp trùng lặp là khác nhau.

ROW_NUMBER(): Trả về số thứ tự cho từng bản ghi trong một nhóm. Mỗi bản ghi, ngay cả khi có giá trị giống nhau, sẽ nhận một số thứ tự duy nhất.

RANK(): Tương tự như ROW_NUMBER(), nhưng nếu có nhiều bản ghi có giá trị giống nhau, chúng sẽ nhận cùng một hạng, nhưng các hạng tiếp theo sẽ bị bỏ qua.

DENSE_RANK(): Cũng giống như RANK(), nhưng các hạng tiếp theo sẽ không bị bỏ qua. Nếu có 2 nhân viên lương bằng nhau ở hạng 1, thì hạng tiếp theo sẽ là 2, chứ không phải 3.