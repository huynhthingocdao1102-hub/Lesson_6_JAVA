public class Main {
    public static void main(String[] args) {

        // Test Point2D
        Point2D p2 = new Point2D(2.5f, 3.5f);
        System.out.println("Point2D: " + p2);
        System.out.println("XY: " + p2.getXY()[0] + ", " + p2.getXY()[1]);

        // Test Point3D
        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3);
        System.out.println("XYZ: " +
                p3.getXYZ()[0] + ", " +
                p3.getXYZ()[1] + ", " +
                p3.getXYZ()[2]);
    }
}