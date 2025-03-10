interface QuanLy{
    public double tinhHoaHong();
}
class GiamDoc extends Nhanvien implements QuanLy{
    private double phuCap;
    private double loiNhuanCongTy;
    public GiamDoc(String ten, double l, double h, double p, double s){
        super(ten, l, h);
        phuCap = p;
        loiNhuanCongTy = s;
    }
    public double tinhHoaHong(){
        return loiNhuanCongTy * 0.05;
    }
    public double tinhLuong(){
        return super.getluongcoban() * super.gethesoluong() + phuCap + tinhHoaHong();
    }
}
class CanBoQuanLy extends Nhanvien{
    private double loiNhuanCongTy;
    public CanBoQuanLy(String ten, double l, double h, double p, double s){
        super(ten, l, h);
        loiNhuanCongTy = s;
    }
    public double tinhHoaHong(){
        return loiNhuanCongTy * 0.002;
    }
    public double tinhLuong(){
        return super.getluongcoban() * super.gethesoluong() + tinhHoaHong();
    }

}


public class bai2 {
    
}
