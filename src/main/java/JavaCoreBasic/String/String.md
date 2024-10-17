1. 
Các đặc điểm và tính chất của String trong Java:
   Trong Java, String là một lớp (class) đặc biệt đại diện cho chuỗi các ký tự. String trong Java có một số đặc điểm quan trọng:

Bất biến (Immutable): Một đối tượng String không thể thay đổi sau khi đã được tạo ra. Nếu có bất kỳ thao tác nào làm thay đổi chuỗi, một đối tượng String mới sẽ được tạo ra thay vì thay đổi trực tiếp chuỗi ban đầu.
Là một đối tượng (Object): Mặc dù bạn có thể sử dụng String như một kiểu dữ liệu, nhưng thực tế nó là một đối tượng của lớp String.
Hỗ trợ nhiều phương thức thao tác chuỗi: Java cung cấp nhiều phương thức để thao tác với chuỗi như length(), charAt(), substring(), toUpperCase(), toLowerCase(), concat(), v.v.

2. Có bao nhiêu cách để tạo một biến String trong Java?
   Trong Java, có hai cách chính để tạo một đối tượng String:

Sử dụng chuỗi ký tự trong dấu ngoặc kép (String literal):

Khi tạo một chuỗi bằng cách sử dụng dấu ngoặc kép, chuỗi đó sẽ được lưu trong String Pool.


Sử dụng từ khóa new:

Khi tạo một chuỗi sử dụng từ khóa new, một đối tượng String mới sẽ được tạo trong bộ nhớ heap, dù chuỗi đó có tồn tại trong String Pool hay không.

So sánh hai cách tạo String:
Cách tạo bằng literal sử dụng String Pool giúp tiết kiệm bộ nhớ, vì các chuỗi giống nhau sẽ tham chiếu đến cùng một đối tượng.
Cách sử dụng từ khóa new tạo ra đối tượng mới mỗi lần được gọi, ngay cả khi giá trị chuỗi đã tồn tại trong String Pool.


3. Tìm hiểu về String Pool:
   String Pool là một tập hợp (pool) các đối tượng String do Java quản lý để tối ưu hóa bộ nhớ. Khi bạn tạo chuỗi bằng chuỗi literal (không dùng từ khóa new), chuỗi đó sẽ được lưu trữ trong String Pool.

Cách hoạt động của String Pool:
Khi một chuỗi mới được tạo bằng cách sử dụng chuỗi literal, JVM kiểm tra xem chuỗi này có tồn tại trong String Pool chưa.
Nếu chuỗi đã tồn tại, tham chiếu của đối tượng chuỗi đã tồn tại trong pool sẽ được sử dụng, thay vì tạo một đối tượng mới.
Nếu chuỗi chưa tồn tại, JVM sẽ tạo một đối tượng mới và thêm vào String Pool.
Đặc điểm của String Pool:
Tính năng này giúp tiết kiệm bộ nhớ bằng cách chia sẻ đối tượng chuỗi thay vì tạo nhiều đối tượng giống nhau.
String Pool chỉ áp dụng với chuỗi literal, không áp dụng cho chuỗi tạo bằng từ khóa new.

4.  
    Cách so sánh hai chuỗi trong Java:
    Có hai cách để so sánh hai chuỗi trong Java:
    So sánh bằng toán tử ==:
    Toán tử == so sánh tham chiếu của hai đối tượng String, tức là kiểm tra xem hai đối tượng có tham chiếu đến cùng một vùng nhớ hay không.
    

    Nó không so sánh nội dung của chuỗi.
    So sánh bằng phương thức equals():
    Phương thức equals() so sánh nội dung của hai chuỗi, kiểm tra xem chúng có cùng các ký tự không.
    Đây là cách nên dùng khi bạn muốn so sánh giá trị của chuỗi.
    So sánh bỏ qua phân biệt chữ hoa/thường bằng equalsIgnoreCase():


    Nếu muốn so sánh hai chuỗi mà không quan tâm đến chữ hoa hay thường, bạn có thể sử dụng equalsIgnoreCase()


    So sánh từ điển bằng compareTo():
    Phương thức compareTo() so sánh hai chuỗi theo thứ tự từ điển (lexicographically). Nó trả về:
    0 nếu hai chuỗi bằng nhau.
    Giá trị âm nếu chuỗi gọi phương thức đứng trước chuỗi được so sánh trong từ điển.
    Giá trị dương nếu chuỗi gọi phương thức đứng sau chuỗi được so sánh trong từ điển.
    
