1. Khi nào sử dụng Queue?
   Queue là một hàng đợi hoạt động theo nguyên tắc FIFO (First In, First Out), tức là phần tử được thêm vào trước sẽ được xử lý trước. Queue rất phù hợp cho các bài toán, quy trình, hoặc luồng công việc yêu cầu xử lý tuần tự, theo thứ tự lần lượt.

Các trường hợp sử dụng Queue:
Hàng đợi yêu cầu (Request Queue):

Sử dụng trong hệ thống web: Trong các ứng dụng web, các yêu cầu từ người dùng đến server sẽ được đặt vào một hàng đợi để xử lý tuần tự. Ví dụ: yêu cầu gửi đến API, server xử lý lần lượt các yêu cầu theo thứ tự chúng đến.
Hệ thống in ấn (Print Queue):

Hàng đợi lệnh in: Các lệnh in được xếp theo thứ tự và máy in sẽ lần lượt in các tài liệu theo thứ tự chúng được yêu cầu.
Luồng công việc xử lý dữ liệu (Data Processing Pipelines):

Hệ thống xử lý dữ liệu: Trong các hệ thống xử lý dữ liệu lớn, dữ liệu được đọc từ các nguồn khác nhau và xếp vào hàng đợi để xử lý theo thứ tự. Mỗi khối xử lý dữ liệu sẽ lấy dữ liệu từ đầu hàng đợi, xử lý xong thì tiếp tục lấy phần tử tiếp theo.
Tác vụ xử lý trong hệ điều hành (OS Task Scheduling):

Lịch trình tác vụ trong hệ điều hành: Các hệ điều hành có một hàng đợi các tác vụ (task queue) cần thực hiện và sẽ xử lý chúng theo thứ tự chúng được thêm vào.
Dịch vụ khách hàng (Customer Service Queue):

Hàng đợi cuộc gọi trong trung tâm dịch vụ: Các cuộc gọi từ khách hàng sẽ được xếp hàng và nhân viên chăm sóc khách hàng sẽ trả lời theo thứ tự cuộc gọi đến.






2. Khi nào sử dụng Deque?
   Deque (Double-Ended Queue) là một hàng đợi hai đầu, cho phép bạn thao tác với dữ liệu từ cả đầu và cuối, cung cấp sự linh hoạt hơn so với Queue. Deque có thể được sử dụng như:

Hàng đợi (FIFO): Khi bạn chỉ thêm vào cuối và lấy từ đầu, giống như Queue.
Ngăn xếp (LIFO): Khi bạn thêm và lấy phần tử ở cùng một đầu.
Các trường hợp sử dụng Deque:
Lưu trữ lịch sử thao tác (Undo/Redo):

Lưu lịch sử của các hành động: Trong các ứng dụng như trình soạn thảo văn bản hoặc phần mềm chỉnh sửa ảnh, các thao tác của người dùng được lưu vào Deque. Người dùng có thể thực hiện thao tác undo (hoàn tác) hoặc redo (làm lại) từ cả hai đầu của danh sách.
Undo: Xóa phần tử cuối cùng (LIFO).
Redo: Thêm lại phần tử đã xóa vào đầu.
Hệ thống tác vụ kép (Dual Task Scheduling):

Xử lý các tác vụ cấp bách: Trong hệ thống tác vụ cần ưu tiên xử lý những việc cấp bách ở đầu hoặc cuối danh sách. Ví dụ: các sự kiện quan trọng có thể được thêm vào đầu để xử lý trước.
Cấu trúc dữ liệu cho thuật toán BFS và DFS:

Thuật toán BFS (Breadth-First Search): Trong đồ thị, thuật toán BFS thường sử dụng Deque như một hàng đợi để xử lý các nút theo chiều rộng, lấy nút từ đầu hàng đợi và thêm nút vào cuối.
Thuật toán DFS (Depth-First Search): Trong khi đó, thuật toán DFS thường sử dụng Deque như một ngăn xếp để đi sâu vào các nhánh, lấy và thêm nút ở đầu (LIFO).
Trình duyệt web (Browser Navigation):

Duyệt lịch sử trang web: Khi người dùng nhấn nút quay lại, trình duyệt sẽ hiển thị trang trước đó (từ đầu Deque), và khi người dùng nhấn nút tiến tới, trang tiếp theo sẽ được hiển thị (từ cuối Deque).
Bộ nhớ đệm (Caching) với LRU (Least Recently Used):

LRU Cache: Deque có thể được sử dụng để triển khai bộ nhớ đệm LRU, trong đó các phần tử ít được sử dụng nhất sẽ bị loại bỏ khỏi một đầu, trong khi phần tử mới nhất sẽ được thêm vào đầu kia.