1. Đặc điểm của Deque:
   Thêm và xóa phần tử ở cả hai đầu: Bạn có thể thực hiện các thao tác thêm (add), xóa (remove), và truy xuất (get) ở cả đầu trước (front) và đầu sau (back).
   Deque có thể hoạt động như một hàng đợi (Queue) hoặc một ngăn xếp (Stack).
2. Các phương thức chính của Deque:
   Deque có các phương thức để thêm, xóa, và truy xuất phần tử từ cả hai đầu.

a. Thêm phần tử:
addFirst(E e): Thêm phần tử vào đầu deque.
addLast(E e): Thêm phần tử vào cuối deque.
offerFirst(E e): Thêm phần tử vào đầu deque và trả về true nếu thành công.
offerLast(E e): Thêm phần tử vào cuối deque và trả về true nếu thành công.
b. Xóa phần tử:
removeFirst(): Xóa và trả về phần tử đầu tiên của deque.
removeLast(): Xóa và trả về phần tử cuối cùng của deque.
pollFirst(): Xóa và trả về phần tử đầu tiên, trả về null nếu deque trống.
pollLast(): Xóa và trả về phần tử cuối cùng, trả về null nếu deque trống.
c. Truy xuất phần tử:
getFirst(): Lấy phần tử đầu tiên mà không xóa.
getLast(): Lấy phần tử cuối cùng mà không xóa.
peekFirst(): Truy xuất phần tử đầu tiên mà không xóa, trả về null nếu deque trống.
peekLast(): Truy xuất phần tử cuối cùng mà không xóa, trả về null nếu deque trống.
d. Sử dụng như Stack (ngăn xếp):
Deque có thể hoạt động như một ngăn xếp bằng cách sử dụng các phương thức:

push(E e): Thêm phần tử vào đầu deque (tương đương với addFirst()).
pop(): Xóa và trả về phần tử đầu tiên (tương đương với removeFirst()).