import java.util.Random;

public class ResizeTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(5);

        Random random = new Random();

        for (Shape shape : shapes) {
            double percent = 1 + random.nextInt(100);

            System.out.println("Tỷ lệ resize: " + percent + "%");
            System.out.println("Diện tích trước: " + shape.getArea());

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }

            System.out.println("Diện tích sau: " + shape.getArea());
            System.out.println("******************");
        }
    }
}