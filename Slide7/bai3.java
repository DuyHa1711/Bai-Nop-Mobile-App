abstract class Shape {
    private String color;
    private boolean filled;
    public Shape(String color, boolean filled){ 
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        color = "rainbow";
        filled = true;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "color: " + color + ", filled: " + filled;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "radius: " + radius + ", " + super.toString();
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        width = 6.9;
        length = 7.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    public String toString(){
        return "width: " + width + ", length: " + length + ", " + super.toString();
    }
}
class Square extends Rectangle{
    public Square(){
        super.setLength(1.0);
        super.setWidth(1.0);
    }
    public Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "side: " + super.getLength() + ", " + super.toString();
    }
}


public class bai3 {
    
}
