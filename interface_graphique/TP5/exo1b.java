import javax.swing.*;

public class exo1b {

    public static void main (String [] args) {

        JFrame fenetre = new JFrame("Etape 10 du TD");

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 400);

        ImageIcon image = new ImageIcon("image/1.gif");
        JLabel label = new JLabel(image);

        fenetre.getContentPane().add(label);

        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }
}