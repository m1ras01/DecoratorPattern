package Example1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redTriangle = new RedShapeDecorator(new Triangle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redRectangle.draw();
        redTriangle.draw();
    }
}
