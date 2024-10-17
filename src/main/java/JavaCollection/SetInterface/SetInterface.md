1. Đặc điểm của Set Interface:
   Không cho phép phần tử trùng lặp: Set không lưu trữ các phần tử trùng lặp. 
    Nếu bạn thêm một phần tử đã tồn tại, phần tử này sẽ bị bỏ qua.(dựa trên giá trị phần tử )

Không đảm bảo thứ tự: Trong hầu hết các triển khai (trừ LinkedHashSet),
Set không đảm bảo thứ tự các phần tử khi chúng được lưu trữ.

Chứa tối đa một phần tử null: Một số triển khai của Set cho phép chứa tối đa một phần tử có giá trị null (ví dụ: HashSet), nhưng một số khác (như TreeSet) không cho phép null.

Hiệu suất truy cập nhanh: Các triển khai của Set thường được tối ưu hóa cho các thao tác kiểm tra sự tồn tại (contains) và thêm phần tử, đặc biệt là HashSet.

2. Các class triển khai từ Set Interface:
   HashSet
   LinkedHashSet
   TreeSet
3. Phân biệt và trường hợp sử dụng của từng class:
   a) HashSet
   Đặc điểm:

Triển khai dựa trên Hash Table.
Không đảm bảo thứ tự của các phần tử.
Cho phép chứa tối đa một phần tử null.
Hiệu suất truy xuất, thêm, xóa phần tử rất nhanh (trung bình O(1) cho mỗi thao tác).
Trường hợp sử dụng:

Dùng khi bạn cần lưu trữ một tập hợp phần tử không trùng lặp và không quan tâm đến thứ tự.
Ví dụ: Lưu trữ danh sách các mã số sinh viên duy nhất, kiểm tra sự tồn tại của phần tử trong tập hợp một cách nhanh chóng.


===========================================================
HashSet: Không đảm bảo thứ tự thêm vào hoặc sắp xếp.
LinkedHashSet: Giữ thứ tự thêm vào.
TreeSet: Tự động sắp xếp phần tử theo thứ tự tự nhiên.
===========================================================
HashSet:
Cho phép chứa tối đa một phần tử null.
LinkedHashSet:
Cho phép chứa một phần tử null giống như HashSet. LinkedHashSet cũng duy trì thứ tự thêm vào, nên nếu bạn thêm null, nó vẫn sẽ được lưu trữ.
TreeSet:
Không cho phép chứa phần tử null
==========================================================