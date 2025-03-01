import javax.swing.*;
import java.awt.*;

public class Exo1 {

    public static void main (String [] args) {

        JFrame fenetre = new JFrame("Une fenetre");

        fenetre.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        // fenetre.setBounds(0, 0, 350, 350);
        fenetre.setSize(400, 500);
        fenetre.setLocationRelativeTo(null);

        Dimension dimEcran = new Dimension (fenetre.getToolkit().getScreenSize());
        System.out.println("Dimension de l'ecran : " + dimEcran);

        JLabel label = new JLabel("Taille de l'ecran : "+ dimEcran);
        // fenetre.getContentPane().add(label);
        fenetre.add(label);
        // fenetre.pack(); // pour ajuster la taille de la fenetre en fonction de ses composants

        fenetre.setVisible(true);
    }
}