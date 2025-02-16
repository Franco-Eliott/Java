// Ecrire un programme java qui place qui place trois composants graphiques
// Cette fois les composants sont positionnés sur une grille de deux lignes et deux colonnes.
// de votre choix sur un JFrame.

import javax.swing.*;
import java.awt.*;
// import jav.awt.event.*;

public class GridLayoutExample {
    
    public static void main (String [] agrs) {

        // creation de la fenetre (1)
        JFrame fenetre = new JFrame("GridLayout");
        // GridLayout(int rows, int cols, int hgap, int vgap)
        fenetre.setLayout(new GridLayout(2, 2, 10, 10));

        // creation des composants (3)
        JButton btn1 = new JButton("btn_1");
        JButton btn2 = new JButton("btn_2");
        JButton btn3 = new JButton("btn_3");

        fenetre.add(btn1);
        fenetre.add(btn2);
        fenetre.add(btn3);

        // proprietes de la fenetre (2)
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 500);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }
}
