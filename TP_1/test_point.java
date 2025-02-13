public class test_point {

    public static void main(String[] args) {

        float f = 14;
        Point p1 = new Point(3, 2);
        System.out.println(p1);

        Point p2;
        p2 = (Point) p1.clone();
        System.out.println(p2);
        p2.setX(2);
        p2.setY(1);
        System.out.println(p2);

        System.out.println("distance1 " + p1.distance1(p2));
        // System.out.println("distance2" + distance2(p1, p2));
        
        System.out.println("milieu1 " + p1.milieu1(p2));
        // System.out.println("milieu2 " + milieu2(p2, p1));

        Point p3 = new Point(f, f);
        System.out.println(p3);
        p3.setX(3);
        p3.setY(2); 
        if (p1.equals(p3)) {
            System.out.println("Idem");
        } else {
            System.out.println("Error");
        }
        

        
    }
}