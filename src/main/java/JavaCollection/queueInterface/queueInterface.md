1. Queue Interface:
   Queue là một interface trong Java Collections Framework đại diện cho một hàng đợi (FIFO - First In, First Out)
, nơi phần tử đầu tiên được thêm vào là phần tử đầu tiên được loại bỏ.

Đặc điểm của Queue Interface:
Thêm phần tử: Sử dụng phương thức offer(E e) hoặc add(E e) để thêm phần tử vào cuối hàng đợi. 
Khác biệt giữa chúng là:
offer(): Trả về false nếu không thể thêm phần tử.
add(): Ném ngoại lệ nếu không thể thêm phần tử.
Loại bỏ phần tử:
poll(): Loại bỏ và trả về phần tử đầu tiên. Trả về null nếu hàng đợi trống.
remove(): Loại bỏ phần tử đầu tiên và ném ngoại lệ nếu hàng đợi trống.
Xem phần tử đầu tiên:
peek(): Trả về phần tử đầu tiên mà không loại bỏ nó, trả về null nếu hàng đợi trống.
element(): Tương tự peek(), nhưng ném ngoại lệ nếu hàng đợi trống.


Các class triển khai Queue Interface:
LinkedList:
Là class thực hiện cả Queue và Deque interface.
Sử dụng khi: Cần một hàng đợi thông thường với khả năng truy cập và thao tác nhanh ở đầu và cuối.

PriorityQueue:
Là một hàng đợi ưu tiên, nơi phần tử có ưu tiên cao hơn sẽ được xử lý trước.
Sử dụng khi: Cần hàng đợi ưu tiên, nơi thứ tự các phần tử được xác định bởi thứ tự tự nhiên hoặc một comparator tùy chỉnh.


ArrayBlockingQueue:
Là hàng đợi với kích thước cố định.
Sử dụng khi: Cần hàng đợi giới hạn kích thước với các hoạt động đồng bộ trong môi trường đa luồng.
ConcurrentLinkedQueue:

Là hàng đợi không giới hạn, an toàn cho việc sử dụng trong môi trường đa luồng.
Sử dụng khi: Cần một hàng đợi hiệu suất cao và không có giới hạn kích thước trong môi trường đa luồng.
2. Deque Interface:
   Deque (Double-Ended Queue) là một interface mở rộng của Queue, cho phép thêm và loại bỏ phần tử từ cả hai đầu của hàng đợi.

Đặc điểm của Deque Interface:
Thêm và xóa phần tử từ cả hai đầu:
Thêm phần tử: addFirst(E e), addLast(E e), offerFirst(E e), offerLast(E e).
Xóa phần tử: removeFirst(), removeLast(), pollFirst(), pollLast().
Xem phần tử từ cả hai đầu:
getFirst(), getLast(), peekFirst(), peekLast().
Stack hỗ trợ: Vì có thể thêm và xóa từ cả hai đầu, Deque có thể được sử dụng như một stack.
Các phương thức như push(E e), pop(), và peek() tương tự các thao tác với stack.
Các class triển khai Deque Interface:
LinkedList:

Cung cấp đầy đủ các thao tác cho Deque.
Sử dụng khi: Cần thao tác với đầu và cuối của hàng đợi với chi phí thấp.
ArrayDeque:

Triển khai một Deque bằng mảng động. Nó không giới hạn kích thước nhưng cần phân bổ lại khi kích thước vượt quá.
Sử dụng khi: Cần một Deque nhanh mà không đồng bộ và không có giới hạn kích thước.
ConcurrentLinkedDeque:

Một Deque không giới hạn và an toàn với đa luồng.
Sử dụng khi: Cần một hàng đợi hai đầu không có giới hạn kích thước trong môi trường đa luồng.
LinkedBlockingDeque:

Là hàng đợi chặn với kích thước có thể định trước.
Sử dụng khi: Cần Deque với kích thước cố định và khả năng đồng bộ trong môi trường đa luồng.
Phân biệt trường hợp sử dụng Queue và Deque:
Queue:
Khi sử dụng: Dùng cho các tình huống FIFO (First In, First Out), nơi phần tử đầu tiên được thêm vào sẽ là phần tử đầu tiên được xử lý.
Ví dụ sử dụng: Hệ thống xử lý tác vụ, quản lý luồng trong lập trình đa luồng.
Deque:
Khi sử dụng: Dùng khi cần thao tác với cả hai đầu của hàng đợi (cả thêm và xóa ở hai đầu).
Ví dụ sử dụng: Cấu trúc dữ liệu ngăn xếp (stack) hoặc hàng đợi hai đầu, sử dụng trong giải thuật xử lý với cả hai đầu (ví dụ: deque trong trò chơi rắn hoặc thuật toán BFS với deque).
Tóm tắt:
Queue: Dùng cho các tác vụ FIFO thông thường (phần tử đầu tiên vào là phần tử đầu tiên ra).
Deque: Dùng cho các tác vụ có thể thao tác ở cả hai đầu (như ngăn xếp hoặc hàng đợi hai đầu).