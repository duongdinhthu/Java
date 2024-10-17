1. Heap là gì?
   Heap là khu vực bộ nhớ dùng để lưu trữ đối tượng (objects) và các mảng trong Java.
   Heap có kích thước lớn hơn stack và dữ liệu ở đây không bị giới hạn bởi nguyên tắc LIFO như stack.
2. Đặc điểm của heap:
   Lưu trữ đối tượng: Các đối tượng được cấp phát bộ nhớ từ heap khi bạn sử dụng từ khóa new (ví dụ: new Person(), new int[10]).
   Bộ nhớ động: Bộ nhớ trong heap được cấp phát động, có nghĩa là khi bạn tạo một đối tượng hoặc mảng, bộ nhớ sẽ được cấp phát trong heap và có thể tồn tại lâu dài cho đến khi không còn tham chiếu nào đến nó. Sau đó, Garbage Collector sẽ dọn dẹp bộ nhớ này.
   Quản lý bộ nhớ: Dung lượng heap lớn hơn và được quản lý bởi Garbage Collector. Nếu bạn tạo quá nhiều đối tượng mà không giải phóng chúng, có thể gây ra OutOfMemoryError.
3. Heap vs Stack:
   Heap lưu trữ dữ liệu phức tạp (như đối tượng, mảng), có dung lượng lớn hơn và quản lý bộ nhớ động.
   Stack lưu trữ biến cục bộ và tham chiếu đến đối tượng (nhưng không lưu trữ dữ liệu thực tế của đối tượng), có dung lượng nhỏ và bị giới hạn.
4. Garbage Collection:
   Khi đối tượng không còn bất kỳ tham chiếu nào (tức là không còn ai sử dụng nó), Garbage Collector sẽ tự động dọn dẹp bộ nhớ của đối tượng đó trong heap.
5. Lợi ích của heap:
   Dữ liệu lâu dài: Các đối tượng trong heap có thể tồn tại suốt quá trình chương trình chạy, miễn là còn tham chiếu đến chúng.
   Quản lý bộ nhớ tự động: Garbage Collector giúp dọn dẹp bộ nhớ không còn sử dụng, giảm thiểu rủi ro rò rỉ bộ nhớ.