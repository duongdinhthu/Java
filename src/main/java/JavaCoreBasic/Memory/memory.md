1. Cấp phát tĩnh và cấp phát động
Cấp phát tĩnh:

Khi chương trình chạy, cấp phát tĩnh có nghĩa là bộ nhớ cho một biến hoặc đối tượng được quyết định ngay từ khi chương trình được biên dịch. Nó không thay đổi trong quá trình chạy. Ví dụ, nếu bạn tạo một mảng với kích thước cố định, kích thước này sẽ không thay đổi trong quá trình chương trình chạy.
Dùng khi: Bạn biết trước lượng bộ nhớ cần dùng, và dữ liệu không thay đổi trong suốt chương trình.


Cấp phát động:

Cấp phát động xảy ra trong khi chương trình đang chạy, tức là bạn yêu cầu thêm bộ nhớ khi cần (bạn không biết trước cần bao nhiêu). Ví dụ: Khi bạn tạo một đối tượng mới hoặc mảng với kích thước thay đổi trong quá trình chạy.
Dùng khi: Bạn không biết trước kích thước hoặc lượng dữ liệu, ví dụ như khi người dùng nhập dữ liệu.


2. Bộ nhớ stack và bộ nhớ heap
   Stack (ngăn xếp):

Stack là bộ nhớ nhỏ mà máy tính dành để lưu trữ các biến đơn giản, như các biến số nguyên (int), hoặc biến cục bộ (biến nằm trong hàm). Nó hoạt động giống như một chồng đĩa: khi bạn thêm biến vào, nó sẽ đặt lên trên, và khi bạn rời khỏi hàm, các biến đó tự động bị xóa khỏi chồng.
Nhanh và dễ quản lý: vì nó tự động xóa biến khi không cần nữa.
Dùng cho: Các biến đơn giản, nhỏ, và biến cục bộ.



Heap (đống):

Heap là vùng nhớ lớn hơn để lưu các đối tượng và mảng khi bạn cần tạo nhiều dữ liệu, hoặc dữ liệu lớn mà bạn không biết trước kích thước. Nhưng khác với stack, heap không tự động giải phóng bộ nhớ, bạn phải "thu gom rác" (garbage collection) để xóa các đối tượng không còn dùng nữa.
Chậm hơn vì việc quản lý phức tạp hơn.
Dùng cho: Các đối tượng lớn và phức tạp, ví dụ như mảng, đối tượng new Object()



Tóm tắt đơn giản:
Cấp phát tĩnh: Bộ nhớ được cấp sẵn ngay từ khi chương trình bắt đầu (dành cho biến đơn giản, biết trước kích thước).

Cấp phát động: Bộ nhớ chỉ được cấp khi chương trình chạy (dành cho đối tượng, mảng có thể thay đổi kích thước).

Stack: Bộ nhớ nhỏ, nhanh, dành cho các biến cục bộ, tự động giải phóng.

Heap: Bộ nhớ lớn, chậm hơn, dành cho các đối tượng lớn, cần tự giải phóng (garbage collection).





Stack có giới hạn dung lượng, được phân bổ tự động và giải phóng nhanh chóng, nhưng bạn cần cẩn thận để không gặp phải lỗi StackOverflowError khi sử dụng quá nhiều biến cục bộ hoặc đệ quy.

Phù hợp với kiểu dữ liệu nguyên thủy: Stack rất phù hợp để quản lý các kiểu dữ liệu nguyên thủy và biến cục bộ trong hàm, vì nó nhanh và không đòi hỏi quản lý bộ nhớ phức tạp.

LIFO: Nguyên tắc Last In, First Out (LIFO) rất phù hợp để quản lý lời gọi hàm và biến cục bộ, vì chúng cần được giải phóng theo thứ tự ngược lại so với khi chúng được tạo ra.

Kiểu dữ liệu phức tạp: Stack lưu trữ tham chiếu đến các đối tượng, trong khi dữ liệu của đối tượng nằm trên heap, giúp quản lý bộ nhớ hiệu quả hơn khi làm việc với dữ liệu lớn.






