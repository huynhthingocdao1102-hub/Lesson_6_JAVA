public class ColorableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Square(6);
        shapes[2] = new Circle(3);

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("*************");
        }
    }
}
