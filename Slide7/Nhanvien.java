public class Nhanvien{
    static int count = 0;
    static double luong = 0;
    public static double getLuong(){
        return luong;
    }
    public static int getCount(){
        return count;
    }
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public Nhanvien(String ten, double l, double h){
        tenNhanVien = ten;
        luongCoBan = l;
        heSoLuong = h;
        count++;
        luong += l * h;
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