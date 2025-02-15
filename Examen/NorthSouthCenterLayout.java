// Ecrire un programme java qui place qui place trois composants graphiques
// (un au nord, un au sud et un au centre) de votre choix sur un JFrame.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class NorthSouthCenterLayout {

    public static void main (String [] args) {

        // creation de la fenetre (1)
        JFrame fenetre = new JFrame ("Nord sud centre");


        // creation des composants (3)
        JButton btnNorth = new JButton("North");
        JButton btnSouth = new JButton("South");
        JButton btnCenter = new JButton("Center");

        // placer les composants sur l'ecran (4)
        Container cont = fenetre.getContentPane ();
        cont.add(btnNorth, BorderLayout.NORTH);
        cont.add(btnSouth, BorderLayout.SOUTH);
        cont.add(btnCenter, BorderLayout.CENTER);

        // proprietes de la fenetre (2)
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 500);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

    }
    
}