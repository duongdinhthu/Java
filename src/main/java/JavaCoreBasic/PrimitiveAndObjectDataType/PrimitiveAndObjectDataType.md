1.Phân biệt kiểu dữ liệu nguyên thủy và kiểu dữ liệu object.


Các loại kiểu dữ liệu nguyên thủy:
Java cung cấp 8 kiểu dữ liệu nguyên thủy:
boolean: Chứa giá trị true hoặc false.
byte: Số nguyên 8-bit (từ -128 đến 127).
short: Số nguyên 16-bit (từ -32,768 đến 32,767).
int: Số nguyên 32-bit (từ -2^31 đến 2^31-1).
long: Số nguyên 64-bit (từ -2^63 đến 2^63-1).
float: Số thực dấu phẩy động 32-bit.
double: Số thực dấu phẩy động 64-bit.
char: Một ký tự Unicode 16-bit.
Lưu trữ trực tiếp giá trị: Các kiểu nguyên thủy lưu trữ giá trị trực tiếp trong ô nhớ.
Không thể là null: Giá trị của kiểu nguyên thủy không thể là null.



Kiểu dữ liệu object (Reference Types):
Là các kiểu dữ liệu phức tạp hơn, chẳng hạn như class, array, interface, function, v.v.
Các biến kiểu object lưu trữ tham chiếu đến đối tượng trong bộ nhớ chứ không phải giá trị trực tiếp.
Khi bạn thay đổi giá trị của đối tượng, tất cả các biến tham chiếu đến đối tượng đó đều thay đổi.


=======================================================

2.Có thể chuyển đổi giữa hai kiểu dữ liệu này không ?

Có thể chuyển đổi kiểu dữ liệu từ kiểu nguyên thủy sang object và ngược lại 

Boxing: Chuyển kiểu nguyên thủy thành object.
Unboxing: Chuyển kiểu object thành nguyên thủy

nhưng khi chuyển object thành nguyên thủy , phải chắc chắn nó không null , vì nó không nhận tham số null 

3.Có thể so sánh hai kiểu dữ liệu này với nhau không?

Có thể so sánh giữa 2 kiểu dữ liệu này tùy thuộc vào 1 số trường hợp
==, !=, <, >, <=, >=


đối với object dùng equal() thay cho == 
Toán tử == chỉ so sánh tham chiếu (liệu hai đối tượng có tham chiếu đến cùng một vùng nhớ hay không), trong khi equals() so sánh giá trị của các đối tượng.

Lưu ý : không thể so sánh nếu chưa chuyển đổi kiểu dữ liệu 

4. Giá trị khởi tạo biến của 2 kiểu này:

Kiểu nguyên thủy: Khi bạn khai báo một biến nguyên thủy mà không khởi tạo giá trị, nó sẽ có giá trị mặc định:

Kiểu nguyên thủy :
byte, short, int, long: 0
float, double: 0.0
char: \u0000 (ký tự null)
boolean: false

Kiểu object :
Khi khai báo một biến object mà không khởi tạo, nó sẽ có giá trị mặc định là null
ví dụ : String name;

