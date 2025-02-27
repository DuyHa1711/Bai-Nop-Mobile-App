package Slide3;
class vecto{
    private double x;
    private double y;
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    static double tichvohuong(vecto a, vecto b){
        return a.getX() * b.getX() + a.getY() * b.getY();
    }
    static vecto cong(vecto a, vecto b){
        vecto c = new vecto();
        c.setX(a.getX() + b.getX());
        c.setY(a.getY() + b.getY());
        return c;
    }
    static vecto nhan(vecto a, double k){
        vecto c = new vecto();
        c.setX(a.getX() * k);
        c.setY(a.getY() * k);
        return c;
    }
}
public class bai2{

    public static void main(String[] args) {
        vecto a = new vecto();
        vecto b = new vecto();
        a.setX(1);
        a.setY(2);
        b.setX(3);
        b.setY(4);
        System.out.println(vecto.tichvohuong(a, b));
        vecto c = vecto.cong(a, b);
        System.out.println(c.getX() + " " + c.getY());
        vecto d = vecto.nhan(a, 2);
        System.out.println(d.getX() + " " + d.getY());

    }
}
