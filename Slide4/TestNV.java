package Slide4;
class Nhanvien{

    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public Nhanvien(String ten, double l, double h){
        tenNhanVien = ten;
        luongCoBan = l;
        heSoLuong = h;
    }
    final double LUONG_MAX = 100000000;
    public boolean tangLuong(double h){
        heSoLuong += h;
        if (luongCoBan * heSoLuong > LUONG_MAX){
            heSoLuong -= h;
            return false;
        }
        return true;    
    }
    public String gettennhanvien(){
        return tenNhanVien;
    }
    public void settennhanvien(String t){
        tenNhanVien = t;
    }
    public double getluongcoban(){
        return luongCoBan;
    }
    public void setluongcoban(double l){
        luongCoBan = l;
    }
    public double gethesoluong(){
        return heSoLuong;
    }
    public void sethesoluong(double h){
        heSoLuong = h;
    }
    public void inTTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong nhan vien: " + luongCoBan * heSoLuong);
    }

}
public class TestNV {
    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien("Nguyen Van A", 1000000, 2);
        Nhanvien nv2 = new Nhanvien("Nguyen Van B", 2000000, 3);
        nv.inTTin();
        nv.tangLuong(1);
        nv.inTTin();
        nv2.inTTin();
        nv2.tangLuong(1);
        nv2.inTTin();
    }
}
