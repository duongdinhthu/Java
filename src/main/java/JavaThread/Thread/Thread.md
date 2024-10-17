1. Process là gì?

Process (tiến trình) là một chương trình đang chạy trên máy tính. Mỗi process có không gian bộ nhớ riêng biệt và các tài nguyên khác như CPU, file, và các thiết bị ngoại vi. Một process có thể chứa nhiều thread để thực hiện nhiều tác vụ đồng thời. Process có thể giao tiếp với các process khác thông qua cơ chế Inter-Process Communication (IPC).
2. Thread là gì?

Thread (luồng) là đơn vị nhỏ nhất của tiến trình, đại diện cho một dòng thực thi trong một process. Mỗi process có thể chứa một hoặc nhiều thread, và các thread trong cùng một process chia sẻ không gian bộ nhớ và các tài nguyên khác của process đó. Thread cho phép thực hiện nhiều tác vụ đồng thời trong cùng một ứng dụng.
3. Có bao nhiêu cách để tạo một thread trong Java? Khác biệt giữa các cách đó là gì?
   Có hai cách chính để tạo một thread trong Java:

Cách 1: Kế thừa từ lớp Thread

Kế thừa lớp Thread và override phương thức run(). Sau đó gọi phương thức start() để bắt đầu thread.
Ưu điểm: Đơn giản và dễ hiểu khi chỉ cần sử dụng một thread riêng lẻ.
Nhược điểm: Java chỉ cho phép kế thừa từ một class, do đó nếu class đã kế thừa từ một class khác, bạn không thể sử dụng cách này.


Cách 2: Implement (cài đặt) giao diện Runnable

Implement giao diện Runnable và định nghĩa phương thức run(), sau đó truyền đối tượng Runnable đó vào một instance của Thread và gọi start().
Ưu điểm: Linh hoạt hơn vì bạn có thể implement nhiều interface và tránh giới hạn kế thừa đơn.
Nhược điểm: Cần thêm một bước tạo đối tượng Thread


4. Multi-thread là gì? Sử dụng multi-thread mang lại ưu và nhược điểm gì?

Multi-thread là khái niệm khi một chương trình sử dụng nhiều thread để thực hiện nhiều tác vụ đồng thời. Điều này giúp tận dụng tối đa khả năng xử lý của CPU đa lõi.

Ưu điểm của multi-thread:

Tăng hiệu suất: Đặc biệt khi có nhiều tác vụ có thể chạy song song, chẳng hạn như xử lý dữ liệu nền và cập nhật giao diện người dùng.
Sử dụng tài nguyên hiệu quả: Multi-thread giúp tận dụng tài nguyên CPU tốt hơn, đặc biệt trên các máy có nhiều nhân xử lý.
Cải thiện phản hồi: Trong các ứng dụng giao diện người dùng, multi-thread giúp giữ giao diện phản hồi ngay cả khi các tác vụ nặng đang chạy ở nền.
Nhược điểm của multi-thread:

Phức tạp: Quản lý các thread có thể gây ra các vấn đề như deadlock, race condition, hay starvation.
Khó debug: Do các thread chạy đồng thời, việc tái tạo lỗi hoặc gỡ lỗi có thể phức tạp hơn.
Overhead: Tạo và quản lý nhiều thread sẽ tốn tài nguyên và có thể gây ra overhead không mong muốn.
5. Làm thế nào để biết được một thread, multi-thread đã hoàn thành hay chưa?

Có thể sử dụng phương thức isAlive() để kiểm tra xem thread có đang chạy hay không. Nếu isAlive() trả về false, nghĩa là thread đã hoàn thành.

Ngoài ra, có thể sử dụng phương thức join() để chờ thread hoàn thành trước khi tiếp tục thực thi phần code tiếp theo. join() đảm bảo rằng thread chính sẽ đợi cho đến khi thread phụ kết thúc.


6. Có giới hạn việc tạo ra bao nhiêu thread trong một ứng dụng Java hay không?

Không có giới hạn cố định về số lượng thread mà một ứng dụng Java có thể tạo, tuy nhiên, số lượng thread thực tế mà bạn có thể tạo bị giới hạn bởi tài nguyên hệ thống, đặc biệt là bộ nhớ và sức mạnh xử lý của CPU. Mỗi thread cần một vùng bộ nhớ riêng cho ngăn xếp (stack), và nếu tạo quá nhiều thread có thể gây ra OutOfMemoryError hoặc làm giảm hiệu suất hệ thống.


