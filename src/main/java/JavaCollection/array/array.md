1. Kiểu Mảng (Array) trong Java:
   Mảng là một cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu, với số lượng phần tử được xác định cố định khi khởi tạo.
   Mảng trong Java là một đối tượng. Khi bạn khai báo một mảng, bạn đang tạo một tham chiếu đến vùng nhớ lưu trữ các phần tử của mảng.
   Các phần tử của mảng được truy cập thông qua chỉ số (index), bắt đầu từ 0.



2. Ưu điểm của kiểu mảng:
   Hiệu suất cao: Mảng lưu trữ các phần tử liền kề nhau trong bộ nhớ, giúp truy cập nhanh bằng cách sử dụng chỉ số. Độ phức tạp của việc truy cập là O(1).
   Dễ dàng thao tác: Cú pháp đơn giản, dễ sử dụng khi biết trước số lượng phần tử.
   Tính đồng nhất: Mảng chỉ lưu trữ các phần tử cùng kiểu dữ liệu, điều này giúp quản lý dữ liệu dễ dàng hơn và bảo đảm an toàn kiểu dữ liệu.
   Tiết kiệm bộ nhớ: So với các cấu trúc dữ liệu động, mảng sử dụng ít bộ nhớ hơn vì không cần lưu trữ thông tin về cấu trúc liên kết như trong danh sách liên kết.


3. Nhược điểm của kiểu mảng:
   Kích thước cố định: Một khi đã khởi tạo mảng với kích thước cụ thể, bạn không thể thay đổi kích thước đó. Nếu bạn cần thêm phần tử sau khi mảng đã đầy, bạn phải tạo một mảng mới có kích thước lớn hơn và sao chép dữ liệu từ mảng cũ sang.
   Lãng phí bộ nhớ: Nếu bạn khởi tạo mảng lớn nhưng không sử dụng hết, bộ nhớ vẫn bị chiếm dụng cho tất cả phần tử, ngay cả khi chúng không chứa giá trị.
   Thiếu tính linh hoạt: Mảng không cho phép thực hiện các thao tác như chèn, xóa phần tử một cách dễ dàng. Khi cần xóa hoặc chèn phần tử, bạn phải dịch chuyển các phần tử khác để bảo đảm sự liên tục trong mảng, điều này tốn thời gian (O(n)).


