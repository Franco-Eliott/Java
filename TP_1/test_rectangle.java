public class test_rectangle {
    
    public static void main (String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 2, 2,4);

        Point p1 = new Point(3, 1);

        r1.setPsg(p1);
        r1.setLar(2);
        r1.setLon(3);

        System.out.println("La lar du rectangle R2 est :" + r2.getLar());
        System.out.println("Le psg du rectangle R2 est :" + r2.getPsg());
        System.out.println("Le perimetre du rectangle R2 est :" + r2.perimetre());
        System.out.println("La surface du rectangle R2 est :" + r2.surface());

        boolean n = r1.equals(r2);
        System.out.println(n);

        System.out.println(r1);
        System.out.println(r2);
        
        Rectangle r3;
        r3 = (Rectangle) r1.clone();
        System.out.println(r3);
        r3.setPsg(p1);
        r3.setLar(1);
        r3.setLon(2);
        System.out.println(r3);

        // System.out.println("Le perimetre du rectangle R3 est :" + perimetre(r3));
        // System.out.println("La surface du rectangle R3 est :" + surface(r3));

        Point p2 = new Point(2, 9);
        boolean b = r2.estDans(p2);
        System.out.println(b);

        boolean a = r2.estInclus(r3);
        System.out.println(a);

    }
}
