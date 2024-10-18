Factory Method Pattern
   Mục đích: Cung cấp cơ chế tạo đối tượng nhưng để lớp con quyết định loại đối tượng cụ thể.
   Triển khai: Dùng một phương thức tĩnh (factory method) trả về đối tượng dựa trên tham số.
   Ưu điểm: Giảm sự phụ thuộc vào lớp cụ thể, dễ mở rộng khi thêm đối tượng mới.
   Trường hợp dùng: Khi chương trình cần tạo đối tượng mà không muốn ràng buộc vào các lớp cụ thể 
(VD: hệ thống quản lý sản phẩm, đối tượng khác nhau dựa trên loại).

Factory Method Pattern thay vì tạo đối tượng trực tiếp bằng từ khóa new, bạn sẽ sử dụng một phương thức để tạo đối tượng. Điều này mang lại một số lợi ích:

Lý do dùng Factory Method thay vì new:
Tăng tính linh hoạt: Khi bạn dùng từ khóa new, bạn đang phụ thuộc vào một lớp cụ thể. Nếu bạn cần thay đổi cách tạo đối tượng hoặc loại đối tượng sau này, bạn sẽ phải thay đổi mã nguồn ở nhiều nơi.
Ẩn logic khởi tạo phức tạp: Đôi khi việc khởi tạo đối tượng có thể phức tạp (ví dụ, cần nhiều tham số hoặc bước xử lý). Factory Method giúp ẩn đi sự phức tạp này và cung cấp một giao diện đơn giản.
Dễ dàng mở rộng: Nếu có thêm loại đối tượng mới, bạn chỉ cần mở rộng phương thức factory mà không phải thay đổi code gọi factory đó.

1. Tách biệt việc tạo đối tượng với logic xử lý
   Factory Method giúp tách việc tạo đối tượng ra khỏi phần logic chính của chương trình. Điều này giúp mã của bạn dễ bảo trì hơn, vì logic tạo đối tượng và logic sử dụng đối tượng được phân tách rõ ràng.
   Khi cần thay đổi cách thức tạo đối tượng (ví dụ: thay đổi tham số khởi tạo, sử dụng các đối tượng khác nhau cho các môi trường khác nhau), bạn chỉ cần thay đổi trong Factory Method mà không phải thay đổi mã ở nhiều nơi trong ứng dụng.
2. Dễ dàng thay đổi kiểu đối tượng mà không ảnh hưởng đến các lớp khác
   Nếu sử dụng Factory Method, bạn có thể dễ dàng thay đổi cách thức tạo đối tượng hoặc thay thế đối tượng mà không cần sửa đổi các phần khác của ứng dụng.
   Ví dụ, nếu bạn muốn thay thế ProductA bằng một lớp con khác (ví dụ: ProductA2), bạn chỉ cần thay đổi trong Factory Method mà không phải đi thay đổi ở mọi nơi bạn khởi tạo ProductA trong ứng dụng.
3. Cung cấp khả năng khởi tạo linh hoạt
   Với Factory Method, bạn có thể kiểm soát cách thức khởi tạo đối tượng, cho phép bạn quyết định cách gọi constructor (với tham số nào, mặc định hay tùy chỉnh). Điều này giúp giảm sự phụ thuộc trực tiếp vào cấu trúc của các lớp con.
   Bạn có thể sử dụng nhiều constructor khác nhau cho một class mà không cần phải làm phức tạp hóa các đoạn mã khởi tạo. Điều này làm cho việc thay đổi tham số constructor trở nên đơn giản hơn, vì không cần phải tìm và sửa tất cả các lần khởi tạo đối tượng trong mã nguồn.
4. Quản lý đối tượng dễ dàng hơn (Singleton, Caching, Reusability)
   Factory Method có thể giúp dễ dàng triển khai các mô hình thiết kế như Singleton. Ví dụ, nếu bạn muốn đảm bảo chỉ có một instance của một đối tượng được tạo ra (như trong trường hợp Singleton), bạn có thể quản lý điều này trong Factory Method mà không cần thay đổi các đoạn mã khởi tạo đối tượng ở nhiều nơi trong ứng dụng.
   Ngoài ra, nếu bạn muốn cache các đối tượng đã tạo để tái sử dụng, Factory Method là một nơi lý tưởng để thực hiện điều này mà không cần phải thay đổi cách khởi tạo đối tượng ở từng nơi.
5. Giảm sự phụ thuộc vào lớp con
   Factory Method giúp giảm sự phụ thuộc vào lớp con khi bạn không cần phải biết chính xác lớp con nào sẽ được tạo ra. Điều này rất hữu ích khi bạn làm việc với các framework hoặc các thư viện bên ngoài, nơi bạn không muốn phải can thiệp vào việc tạo các đối tượng.
   Nó cho phép bạn sử dụng Polymorphism (đa hình) mà không phải lo lắng về các chi tiết cài đặt của lớp con.
6. Tối ưu hóa mã nguồn trong các ứng dụng phức tạp
   Khi làm việc với các ứng dụng phức tạp có nhiều loại đối tượng hoặc nhiều cấu hình khác nhau, Factory Method giúp đơn giản hóa việc khởi tạo các đối tượng.
   Bạn có thể dễ dàng thay đổi cách khởi tạo đối tượng mà không làm thay đổi logic trong các lớp khác, giúp mã nguồn trở nên dễ hiểu và dễ bảo trì.
   So với việc sử dụng constructor trực tiếp:
   Khi bạn gọi constructor trực tiếp, bạn phải luôn nhớ cấu trúc constructor và tham số của nó ở mỗi nơi bạn tạo đối tượng. Điều này có thể dẫn đến:
   Mã bị lặp lại nhiều lần, nếu cần thay đổi tham số hay logic khởi tạo, bạn sẽ phải thay đổi nhiều chỗ.
   Khó bảo trì, nếu bạn có logic tạo đối tượng phức tạp hơn (ví dụ: cần tạo đối tượng dựa trên một số điều kiện phức tạp).
   Dễ dẫn đến sự phụ thuộc chặt chẽ vào lớp con, làm cho mã của bạn khó mở rộng hoặc thay đổi sau này.
   Tổng kết:
   Factory Method mang lại tính linh hoạt, tách biệt và dễ bảo trì trong việc khởi tạo đối tượng, giúp mã của bạn dễ dàng thay đổi, mở rộng và quản lý hơn so với việc gọi constructor trực tiếp. Nó là một phương pháp hữu ích khi bạn làm việc với các hệ thống phức tạp, đặc biệt là khi cần phải xử lý các đối tượng có nhiều loại hoặc cấu hình khác nhau.