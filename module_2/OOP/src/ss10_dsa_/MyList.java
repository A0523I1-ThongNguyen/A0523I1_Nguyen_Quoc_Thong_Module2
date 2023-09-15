package ss10_dsa_;

import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {
    public int kichCoChua = 0; //tuong trung, da co ham kichthuocdambao lo
    private static final int DUNG_LUONG_MAC_DINH = 10;
    Object thanhPhanChua[];

    public MyList() {
        thanhPhanChua = new Object[DUNG_LUONG_MAC_DINH];
    } 

    public MyList(int dungTich) {
        if (dungTich <= 0) {
            throw new IndexOutOfBoundsException("Dung Tích Không Thể Âm");
        }
        thanhPhanChua = new Object[dungTich];
    }

    //Tang kich thuoc mang len 2 lan
    public void kichThuocDamBao() {
        int newKichCo = thanhPhanChua.length * 2;
        thanhPhanChua = Arrays.copyOf(thanhPhanChua, newKichCo);
        //nếu độ dài thành phần chứa = kích thước mảng thì tạo mảng mới có kích thước nhân 2 so vs số dộ dài thành phần chứa;
    }

    // Them 1 phan tu e vao danh sach
    public boolean add(T e) {
        if (kichCoChua == thanhPhanChua.length) {//tuong trung hay ap dung vao dau?
            kichThuocDamBao();
        }
        thanhPhanChua[kichCoChua++] = e; //có nghĩa là gán giá trị của biến `e` vào phần tử của mảng `elements` tại vị trí `size`, sau đó tăng giá trị của biến `size` lên 1.
        return true;
    }

    //Lấy ra phần tử theo vị trí index
    public T get(int index) {
        if (index < 0 || index >= kichCoChua) { // nhap vao vitri index <0 OR > size thì trả về null
            throw new IndexOutOfBoundsException("Index: " + index + " Size "+ index);

        }
        for (int i = 0; i < kichCoChua; i++) {
            if (i == index){
                return (T) thanhPhanChua[i];
            }
        }
        return (T) thanhPhanChua[kichCoChua];
    }

    //Xoa all
    public void clear() {
        kichCoChua = 0; // tuong trung hay co muc dich?
        for (int i = 0; i < thanhPhanChua.length; i++) {
            thanhPhanChua[i] = null;
        }
    }

    //lay ra so luong phan tu trong list / hay lay ra kich co
    public int kichCoChua() {
        return this.kichCoChua;
    }

    // thêm phần tử phantu vào list ở vị trí chỉ định index
    public void add(int index, T phantu) { // thay void = T de return tra ve danh sach khi them dc k?
        if (index >= kichCoChua || index < 0) { //dk ma` vitri index k the them vao list
            throw new IndexOutOfBoundsException("Index " + index + "| Size" + index);
        }
        if (kichCoChua == thanhPhanChua.length) {
            kichThuocDamBao();
        }
        //vong lap nay de lam gi? i >=index(index chay tu 0?)
        for (int i = kichCoChua; i >= index; i--) {// gán i = kích cỡ chứa , kích cỡ chứa phải >= vị trí index cần thêm vào list,khi thêm vào 1 phần tử thì kích thước bị giảm đi 1 kích thước (i--)
            thanhPhanChua[i+1] = thanhPhanChua[i];// gắn kích thước chứa - 1 = kích thước chứa tối đa, để nó luôn thõa điều kiện khi thêm vào phải cần 1 ô kích thước rỗng
        }
        thanhPhanChua[index] = phantu;
        kichCoChua++; // phai kich thuoc tang 1
        //return (T) thanhPhanChua;
    }

    // xóa 1 phần tử ở vị trí index được chỉ
    public T remove(int index) { // thay void in ra
        if (index >= kichCoChua || index < 0) {
            throw new IndexOutOfBoundsException("Index" + index + ", Size" + index);
        }
        //i co nen < kichCoChua -1 ?
        for (int i = index; i < kichCoChua; i++) {//gắn i = vị trí index cần chèn, vitri cần chèn index phải bé hơn kích cỡ chứa
            thanhPhanChua[i] = thanhPhanChua[i + 1];//vị trí phía sau(i+1) chèn vào vị trí index cần xóa,lặp các vị trí phía sau chèn tới trước
        }
        kichCoChua--;
        return (T) thanhPhanChua;
        // System.out.println(thanhPhanChua);
    }

    //copy ra 1 mang moi
    public T clone() {
        Object[] newThanhPhanChua = new Object[kichCoChua];
        newThanhPhanChua = thanhPhanChua;
        return (T) newThanhPhanChua;
    }

    //check phan tu co ton tai trong list khong?
    public boolean contains(T e){
        for (int i = 0; i < kichCoChua; i++) {
            if (thanhPhanChua[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    //lay vi tri cua phan tu e trong list
    public int indexOf(T e){
        for (int i = 0; i < kichCoChua; i++) {
            if (thanhPhanChua[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public void get() {
        for (int i = 0; i < kichCoChua; i++) {
            System.out.println(thanhPhanChua[i]);
        }
    }
}

