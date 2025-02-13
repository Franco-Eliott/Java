public class test_cercle {
    
    public static void main (String [] args) {

        Cercle c = new Cercle(0, 0, 14);
        Point p1 = new Point(15, 17);
        p1.setX(17);
        c.setCentre(p1);
        System.out.println(c);

        Cercle c2 = new Cercle(p1, 25);
        System.out.println(c);
        // System.out.println(c2);

        System.out.println(p1); // correct

    }
}
