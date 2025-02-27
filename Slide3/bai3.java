package Slide3;
class Nhanvien{
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
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
public class bai3 {
    public static void main(String[] args){
        Nhanvien nv = new Nhanvien();
        nv.settennhanvien("Nguyen Van A");
        nv.setluongcoban(1000000);
        nv.sethesoluong(2);
        nv.inTTin();
        nv.tangLuong(1);
        nv.inTTin();
    }
}
