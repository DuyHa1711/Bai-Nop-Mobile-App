package Slide5;

public class bai2 {
    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien("Nguyen Van A", 1000000, 2);
        Nhanvien nv2 = new Nhanvien("Nguyen Van B", 2000000, 3);
        System.out.println("Tong so luong la: " + Nhanvien.getLuong());
    }
}
