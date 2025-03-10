class TruongPhong extends Nhanvien{
    private double phuCap;
    private double soNamDuongTac;

    public TruongPhong(String ten, double l, double h, double p, double s){
        super(ten, l, h);
        phuCap = p;
        soNamDuongTac = s;
    }
    public double tinhLuong(){
        return super.getluongcoban() * super.gethesoluong() + phuCap;
    }
    public void inTTin(){
        super.inTTin();
        System.out.println("Phu cap: " + phuCap);
        System.out.println("So nam duong tac: " + soNamDuongTac);
    }
}
public class bai1 {
    public static void main(String[] args) {
        TruongPhong tp = new TruongPhong("Nguyen Van A", 10000000, 2.0, 5000000, 5);
        tp.inTTin();
        System.out.println("Luong truong phong: " + tp.tinhLuong());
    }
}
