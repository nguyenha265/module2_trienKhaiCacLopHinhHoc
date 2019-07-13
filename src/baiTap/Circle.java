package baiTap;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += ((percent/100)*this.radius);
    }
    public double area(){
        return (this.radius * this.radius)*Math.PI;
    }
}
