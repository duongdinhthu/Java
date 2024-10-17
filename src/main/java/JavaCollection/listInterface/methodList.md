add(E e): Thêm phần tử vào cuối danh sách.
add(int index, E element): Thêm phần tử tại một vị trí chỉ định trong danh sách.
remove(int index): Xóa phần tử tại vị trí được chỉ định.
remove(Object o): Xóa phần tử đầu tiên xuất hiện có giá trị bằng với đối tượng chỉ định.
get(int index): Lấy phần tử tại vị trí chỉ định.
set(int index, E element): Thay thế phần tử tại vị trí chỉ định bằng giá trị mới.
size(): Trả về số lượng phần tử trong danh sách.
isEmpty(): Kiểm tra xem danh sách có trống hay không.
clear(): xóa các phần tử khỏi list
contains(Object o): Kiểm tra xem danh sách có chứa một phần tử cụ thể hay không.
indexOf(Object o): Trả về vị trí đầu tiên của phần tử trong danh sách hoặc -1 nếu không tìm thấy.
lastIndexOf(Object o): Trả về vị trí xuất hiện cuối cùng của phần tử trong danh sách hoặc -1 nếu không tìm thấy.
iterator(): Trả về một Iterator để duyệt qua các phần tử của danh sách.
listIterator(): Trả về một ListIterator có thể duyệt danh sách theo cả hai chiều.
forEach(Consumer<? super E> action): Áp dụng một hành động cụ thể cho từng phần tử của danh sách.
subList(int fromIndex, int toIndex): Trả về một danh sách con từ chỉ số fromIndex đến toIndex.
sort(Comparator<? super E> c): Sắp xếp danh sách theo một Comparator cụ thể.
replaceAll(UnaryOperator<E> operator): Thay thế tất cả phần tử trong danh sách bằng kết quả của một hàm toán học đơn nhất áp dụng cho từng phần tử.