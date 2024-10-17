package JavaCollection.listInterface;


import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    private List<Object> items = new ArrayList<Object>();
    private String a = "a";
    private int b = 1;
    private double c = 1.0;
    private boolean d = true;
    public List<Object> listInterfaceAdd() {
        items.add(a);
        items.add(b);
        items.add(c);
        items.add(d);
        return items;
    }
    public List<Object> listInterfaceRemove() {
        items.clear();
        return items;
    }
    public Object listInterfaceGet(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);  // Trả về phần tử tại chỉ số
        }
        return "Index không hợp lệ!";
    }

    public void listInterfaceAdd(String newElement) {
        items.add(newElement);  // Thêm phần tử mới vào danh sách
    }
    public void listInterFace(){
        System.out.println(items);
    }

}
