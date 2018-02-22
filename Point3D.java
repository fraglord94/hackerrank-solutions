//public class Point3D extends Point {
//    private double z;
//
//    private Point3D(double x, double y, double zCoord) {
//        super(x, y);
//        this.z = zCoord;
//    }
//
//    private static double distance(Point3D p1, Point3D p2){
//        double dx = p1.x - p2.x;
//        double dy = p1.y - p2.y;
//        double dz = p1.z - p2.z;
//        return Math.sqrt(dx * dx + dy * dy + dz * dz);
//    }
//
//    public static void main(String[] args) {
//        Point3D p1 = new Point3D(-4, 2, 5);
//        Point3D p2 = new Point3D(1, 3, -2);
//        System.out.println("Distance between them is " + Point3D.distance(p1, p2));
//    }
//
//    public double getZ() {
//        return z;
//    }
//}
