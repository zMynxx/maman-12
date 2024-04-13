public class StudentTesterBox3D {
    public static void main(String[] args) {
        System.out.println(
                "********************************************************************************************************************************");
        System.out.println(
                "IMPORTANT: Please note that this is only a basic test class. You will need to write your own test to fully test class your code.");
        System.out.println(
                "********************************************************************************************************************************\n");
        testBox3D();
    }

    private static void testBox3D() {
        System.out.println("\nTesting Box3D:");

        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(4, 5, 6);

        Box3D b1 = new Box3D();
        Box3D b2 = new Box3D(p1, 1, 1, 1);
        Box3D b3 = new Box3D(p2, 2, 0, -2);
        Box3D b4 = new Box3D(b3);

        System.out.println("Calling getters and setters...");
        b1.setLength(1);
        b1.setWidth(2);
        b1.setHeight(2);
        b1.setBase(p2);
        int length = b1.getLength();
        int width = b1.getWidth();
        int height = b1.getHeight();
        Point3D base = b1.getBase();
        if (length != 1) {
            System.out.println("\tEither getLength or setLength are not correct");
        }
        if (width != 2) {
            System.out.println("\tEither getWidth or setWidth are not correct");
        }
        if (height != 2) {
            System.out.println("\tEither getHeight or setHeight are not correct");
        }
        if (base.getX() != 4 || base.getY() != 5 || base.getZ() != 6) {
            System.out.println("\tEither getBase or setBase are not correct");
        }

        System.out.println("Calling toString...");

        if (!b1.toString().equals("The base point is (4.0,5.0,6.0), length = 1, width = 2, height = 2")) {
            System.out.println("\ttoString is not correct");
        }

        System.out.println("Calling equals...");

        if (b2.equals(b3)) {
            System.out.println("\tequals is not correct");
        }
        if (!b3.equals(b4)) {
            System.out.println("\tequals is not correct");
        }

        System.out.println("Calling move...");
        Box3D b5 = b1.move(1, 2, 3);
        Point3D p3 = b5.getBase();
        Point3D p4 = b1.getBase();

        if (p3.getX() != 5 || p3.getY() != 7 || p3.getZ() != 9) {
            System.out.println("\tmove is not correct");
        }
        if (p4.getX() != 4 || p4.getY() != 5 || p4.getZ() != 6) {
            System.out.println("\tmove is not correct");
        }

        System.out.println("Calling getUpRightBackPoint...");
        Point3D p5 = b1.getUpRightBackPoint();

        if (p5.getX() != 3 || p5.getY() != 7 || p5.getZ() != 8) {
            System.out.println("\tgetUpRightBackPoint is not correct");
        }

        System.out.println("Calling getCenter...");
        Point3D p6 = b1.getCenter();

        if (p6.getX() != 3.5 || p6.getY() != 6 || p6.getZ() != 7) {
            System.out.println("\tgetCenter is not correct");
        }

        System.out.println("Calling distance...");
        double distance1 = b1.distance(b2);
        double distance2 = b3.distance(b4);

        if (distance1 - 9.40744386111339 > 0.001) {
            System.out.println("\tdistance is not correct");
        }
        if (distance2 != 0) {
            System.out.println("\tdistance is not correct");
        }

        System.out.println("Calling getVolume...");
        double volume1 = b1.getVolume();
        double volume2 = b3.getVolume();
        double volume3 = b4.getVolume();

        if (volume1 - 4.0 > 0.001) {
            System.out.println("\tgetVolume is not correct");
        }
        if (volume2 != volume3) {
            System.out.println("\tgetVolume is not correct");
        }

        System.out.println("Calling getSurfaceArea ...");
        double surfaceArea1 = b1.getSurfaceArea();
        double surfaceArea2 = b3.getSurfaceArea();
        double surfaceArea3 = b4.getSurfaceArea();

        if (surfaceArea1 - 16.0 > 0.001) {
            System.out.println("\tgetSurfaceArea is not correct");
        }
        if (surfaceArea2 != surfaceArea3) {
            System.out.println("\tgetSurfaceArea is not correct");
        }

        System.out.println("Calling isLargerCapacity...");


        if (!b1.isLargerCapacity(b2)) {
            System.out.println("\tisLargerCapacity is not correct");
        }
        if (b2.isLargerCapacity(b3)) {
            System.out.println("b2 :" + b2.getVolume());
            System.out.println("b3 :" + b3.getVolume());
            System.out.println("\tisLargerCapacity is not correct");
        }
        if (b3.isLargerCapacity(b4)) {
            System.out.println("\tisLargerCapacity is not correct");
        }

        System.out.println("Calling contains...");

        b5 = new Box3D(b1);
        b5.setLength(3);

        if (b3.contains(b2)) {
            System.out.println("\tcontains is not correct");
        }
        if (!b5.contains(b2) || !b5.contains(b3)) {
            System.out.println("\tcontains is not correct");
        }
        if (b3.contains(b4)) {
            System.out.println("\tcontains is not correct");
        }

        System.out.println("Calling isAbove...");

        b1 = new Box3D(new Point3D(1, 2, 3), 4, 5, 6);
        b2 = new Box3D(new Point3D(1, 2, 10), 4, 5, 4);
        if (!b2.isAbove(b1)) {
            System.out.println("\tisAbove is not correct");
        }

        b2 = new Box3D(new Point3D(1, 2, 8), 4, 5, 4);
        if (b2.isAbove(b1)) {
            System.out.println("\tisAbove is not correct");
        }

        if (b3.isAbove(b4)) {
            System.out.println("\tisAbove is not correct");
        }
    }
}
