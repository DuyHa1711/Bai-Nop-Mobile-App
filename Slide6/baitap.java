package Slide6;
import Slide5.Nhanvien;
class PhongBan{
    private String tenPhongBan;
    private byte soNhanVien;
    private final int SO_NV_MAX = 100;
    private Nhanvien[] dsNhanVien = new Nhanvien[SO_NV_MAX];
    public PhongBan(String tenPhongBan){
        this.tenPhongBan = tenPhongBan;
    }
    public boolean themNV(Nhanvien nv){
        if(soNhanVien < SO_NV_MAX){
            dsNhanVien[soNhanVien] = nv;
            soNhanVien++;
            return true;
        }
        return false;
    }
    public Nhanvien xoaNV(){
        if (soNhanVien > 0){
            soNhanVien--;
            return dsNhanVien[soNhanVien];
        }
        return null;
    }
    public double tongLuong(){
        double tong = 0;
        for (int x = 0; x < soNhanVien; x++){
            tong += dsNhanVien[x].getluongcoban() * dsNhanVien[x].gethesoluong();
        }
        return tong;
    }
    public void inTTin(){
        System.out.println("Ten phong ban: " + tenPhongBan);
        System.out.println("So nhan vien: " + soNhanVien);
        System.out.println("Thong tin cac nhan vien:");
        for (int x = 0; x < soNhanVien; x++){
            dsNhanVien[x].inTTin();
        }
    }
}
public class baitap {
    public static void main(String[] args) {
        PhongBan pb = new PhongBan("Phong IT");
        Nhanvien nv1 = new Nhanvien("Nguyen Van A", 10000000, 2);
        Nhanvien nv2 = new Nhanvien("Nguyen Van B", 20000000, 3);
        Nhanvien nv3 = new Nhanvien("Nguyen Van C", 30000000, 4);
        pb.themNV(nv1);
        pb.themNV(nv2);
        pb.themNV(nv3);
        pb.inTTin();
        System.out.println("Tong luong cua phong ban: " + pb.tongLuong());
        pb.xoaNV();
        pb.inTTin();
        System.out.println("Tong luong cua phong ban: " + pb.tongLuong());
    }
}
