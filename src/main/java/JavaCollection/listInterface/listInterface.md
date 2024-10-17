1. Đặc điểm của List Interface:
   List là một giao diện (interface) trong Java, nằm trong gói java.util. Nó đại diện cho một danh sách có thứ tự (ordered collection) mà có thể chứa các phần tử trùng lặp.

Các đặc điểm chính của List:
Duy trì thứ tự phần tử: List lưu trữ các phần tử theo thứ tự chúng được thêm vào. Khi duyệt qua List, các phần tử sẽ xuất hiện theo đúng thứ tự mà bạn đã thêm.
Hỗ trợ các phần tử trùng lặp: Không giống như Set, List cho phép thêm các phần tử có giá trị giống nhau.
Truy cập ngẫu nhiên thông qua chỉ số (index): Bạn có thể truy cập, sửa đổi, thêm hoặc xóa phần tử dựa trên vị trí của nó thông qua chỉ số.
Có thể chứa null: List có thể chứa phần tử null.
Các phương thức cơ bản của List:
add(E element): Thêm phần tử vào danh sách.
get(int index): Truy cập phần tử tại vị trí index.
remove(int index): Xóa phần tử tại vị trí index.
size(): Trả về số lượng phần tử trong danh sách.
contains(Object o): Kiểm tra xem danh sách có chứa một phần tử cụ thể không.
indexOf(Object o): Trả về chỉ số của phần tử đầu tiên xuất hiện trong danh sách (nếu có).
subList(int fromIndex, int toIndex): Tạo một danh sách con từ List.
2. Các class triển khai List Interface:
   Một số lớp phổ biến triển khai từ List là:

ArrayList
LinkedList
Vector
Stack (kế thừa từ Vector)
3. Phân biệt và trường hợp sử dụng của từng class:
   3.1. ArrayList:
   Đặc điểm:

ArrayList sử dụng mảng động để lưu trữ các phần tử.
Truy cập ngẫu nhiên nhanh (O(1)) vì nó dựa trên chỉ số.
Thao tác thêm/xóa phần tử (ở cuối danh sách) hiệu quả, nhưng nếu thêm/xóa ở giữa danh sách, hiệu suất sẽ giảm (O(n)) do phải dịch chuyển các phần tử.
Kích thước của mảng có thể tự động tăng lên khi cần thiết, nhưng việc tăng kích thước có thể gây tốn tài nguyên khi bộ nhớ cần được phân bổ lại.
Trường hợp sử dụng:

Khi bạn cần truy cập các phần tử theo chỉ số thường xuyên.
Khi việc chèn/xóa ở giữa danh sách không phải là thao tác chính.
Khi kích thước danh sách có thể thay đổi động mà không cần phải cố định từ đầu.
Ví dụ:


List<String> arrayList = new ArrayList<>();
arrayList.add("A");
arrayList.add("B");
3.2. LinkedList:
Đặc điểm:

LinkedList sử dụng danh sách liên kết kép (doubly linked list) để lưu trữ các phần tử.
Truy cập theo chỉ số chậm hơn (O(n)) so với ArrayList vì phải duyệt qua từng phần tử từ đầu danh sách.
Thêm/xóa phần tử ở đầu hoặc cuối danh sách rất nhanh (O(1)), phù hợp với các thao tác chèn/xóa thường xuyên.
Trường hợp sử dụng:

Khi bạn cần thêm hoặc xóa phần tử ở đầu hoặc cuối danh sách một cách thường xuyên.
Khi truy cập ngẫu nhiên không phải là thao tác quan trọng.
Phù hợp cho các cấu trúc dữ liệu như hàng đợi (queue) hoặc ngăn xếp (stack).



3.3. Vector:
Đặc điểm:

Vector cũng sử dụng mảng động như ArrayList, nhưng đồng bộ hóa (synchronized) để đảm bảo an toàn khi nhiều luồng truy cập cùng lúc.
Kích thước của Vector cũng tự động tăng khi cần.
Vì Vector là đồng bộ hóa, nên nó chậm hơn ArrayList trong các thao tác đơn luồng.
Trường hợp sử dụng:

Khi bạn cần một danh sách an toàn cho nhiều luồng truy cập đồng thời.
Khi tính đồng bộ là cần thiết và không quá quan trọng về hiệu suất.


3.4. Stack:
Đặc điểm:

Stack là lớp con của Vector, hoạt động theo nguyên tắc LIFO (Last In First Out).
Stack có các phương thức như push() để thêm phần tử vào đầu ngăn xếp và pop() để lấy phần tử ra.
Trường hợp sử dụng:

Khi bạn cần thực hiện các thao tác theo nguyên tắc LIFO, chẳng hạn như giải thuật đệ quy hoặc duyệt cây.
