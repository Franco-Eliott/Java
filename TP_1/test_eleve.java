public class test_eleve {

    public static void main (String [] args) {

        Eleve e1 = new Eleve("Eliott");
        System.out.println(e1);
        Eleve e2 = new Eleve("Tix", 10, 15, 12, 14);

        e1.setMath(3);
        e1.setPhy(14);
        e1.setFra(16);
        e1.setAng(13);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("La moyenne de " + e1.nom + " est de: " + e1.moyenne());
        System.out.println("La moyenne de " + e2.nom + " est de: " + e2.moyenne());

        Eleve e3;
        e3 = (Eleve)e2.clone();
        System.out.println(e3);

        e3.setMath(3);
        e3.setPhy(14);
        e3.setFra(16);
        e3.setAng(13);
        System.out.println(e3);

        System.out.println(e1.equals(e3));
    }
}