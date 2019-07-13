package baiTap;

public class main {
    public static void main(String[] args) {
        double random = Math.floor(Math.random() * 100);

        Circle[] arrayCircle = new Circle[3];
        arrayCircle[0] = new Circle(5);
        arrayCircle[1] = new Circle(10);
        arrayCircle[2] = new Circle(15);
        for (Circle circle : arrayCircle) {
            System.out.println("trước khi tăng hình tròn " + circle.area());
        }
        for (Circle circle : arrayCircle) {
            circle.resize(random);
            System.out.println("sau khi tăng hình tròn " + circle.area());
        }
        Rectangle[] arrayRectangle = new Rectangle[3];
        arrayRectangle[0] = new Rectangle(4, 5);
        arrayRectangle[1] = new Rectangle(5, 6);
        arrayRectangle[2] = new Rectangle(10, 5);
        for (Rectangle rectangle : arrayRectangle) {
            System.out.println("trước khi tăng hình chữ nhât " + rectangle.area());
        }
        for (Rectangle rectangle : arrayRectangle) {
            rectangle.resize(random);
            System.out.println("sau khi tăng hình chữ nhật " + rectangle.area());
        }
        Square[] arraySquare = new Square[3];
        arraySquare[0] = new Square(5);
        arraySquare[1] = new Square(10);
        arraySquare[2] = new Square(20);
        for (Square square : arraySquare) {
            System.out.println("trước khi tăng hình vuông " + square.area());
        }
        for (Square square : arraySquare) {
            square.resize(random);
            System.out.println("sau khi tăng hình vuông " + square.area());
        }
    }
}
