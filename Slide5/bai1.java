package Slide5;

public class bai1 {
    public static void main(String[] args){
        Nhanvien nv1 = new Nhanvien("Nguyen Van A", 1000000, 2);
        Nhanvien nv2 = new Nhanvien("Nguyen Van B", 2000000, 3);
        Nhanvien nv3 = new Nhanvien("Nguyen Van C", 3000000, 4);
        System.out.println("So nhan vien: " + Nhanvien.getCount());
    }
}
