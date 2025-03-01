// etape 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exo2a {
    
    public static void main (String [] args) {

        JFrame fenetre = new JFrame ("Nombre mysterieux");

        // etape 4
        JButton btnFin = new JButton("Fin");
        JButton btnCommencer = new JButton("Commencer");

        String resultat = "Trouver un nbre entre 0 et 99";
        JLabel lblResultat = new JLabel(resultat);
        String nbCoups = "0";
        JLabel lblNbCoups = new JLabel(nbCoups);

        JTextField txtSaisie = new JTextField (5);

        // etape 5
        Container cont = fenetre.getContentPane();
        cont.add(btnFin, BorderLayout.WEST);
        cont.add(btnCommencer, BorderLayout.EAST);
        cont.add(lblResultat, BorderLayout.NORTH);
        cont.add(lblNbCoups, BorderLayout.SOUTH);

        // etape 3
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 500);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }
}
