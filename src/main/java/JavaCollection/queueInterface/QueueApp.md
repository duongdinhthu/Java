LinkedList Queue:

Là hàng đợi thông thường với khả năng truy cập và thao tác nhanh ở đầu và cuối.
Thao tác: offer(), poll(), peek().


PriorityQueue:
Là hàng đợi ưu tiên, nơi các phần tử được sắp xếp theo thứ tự ưu tiên (sử dụng compareTo() hoặc Comparator).
Thao tác: offer(), poll(), peek().


ArrayBlockingQueue:
Là hàng đợi có kích thước cố định, được sử dụng trong môi trường đa luồng khi cần giới hạn số lượng phần tử trong hàng đợi.
Thao tác: offer(), poll(), peek().



ConcurrentLinkedQueue:
Là hàng đợi không đồng bộ, an toàn trong môi trường đa luồng, cho phép thao tác với phần tử mà không cần đồng bộ hóa.
Thao tác: offer(), poll(), peek().


Mảng lưu trữ liên tục trong heap, và chứa các tham chiếu (đối với đối tượng) hoặc giá trị nguyên thủy.
Hàng đợi có thể sử dụng cấu trúc dữ liệu khác nhau, nhưng các phần tử trong hàng đợi (thường là tham chiếu đến các đối tượng hoặc giá trị nguyên thủy) vẫn được lưu trữ trong heap,
với cách tổ chức khác nhau tùy vào từng loại hàng đợi.