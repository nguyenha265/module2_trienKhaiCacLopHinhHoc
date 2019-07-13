package baiTap;

public class Square implements Resizeable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        this.side += (percent/100)*this.side;

    }
    public double area(){
      return this.side * this.side;
    }
}
