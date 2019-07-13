package baiTap;

public class Rectangle implements Resizeable {
   private double height;
   private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        this.height += (percent/100)*this.height;
        this.width += (percent/100)*this.width;
    }
    public double area(){
       return this.height * this.width;
    }
}
