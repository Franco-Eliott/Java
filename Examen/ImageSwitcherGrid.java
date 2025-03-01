// Ecrire un programme Java qui affiche une grille contenant deux cases.
// Initialement, chaque case contient une image.
// Quand une case reçoit un clic de la souris, on affiche l’image suivante.
// On suppose qu’on dispose de quatre images pour l’une des deux cases et de cinq images pour l’autre.

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.*;

public class ImageSwitcherGrid implements ActionListener {

    JFrame fenetre;
    ImageIcon[] tabIcons1 = new ImageIcon[4];
    ImageIcon[] tabIcons2 = new ImageIcon[5];
    JButton button1, button2;
    JPanel panel;

    int i = 0,j = 0;

    public ImageSwitcherGrid() {

        fenetre = new JFrame("ImageSwitcher");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(null);
        fenetre.setSize(800, 420);

        // tabIcons1[0] = new ImageIcon("images/1/3.gif");
        // tabIcons1[1] = new ImageIcon("images/1/4.gif");
        // tabIcons1[2] = new ImageIcon("images/1/5.gif");
        // tabIcons1[3] = new ImageIcon("images/1/6.gif");

        // tabIcons2[0] = new ImageIcon("images/2/1.jpg");
        // tabIcons2[1] = new ImageIcon("images/2/2.jpg");
        // tabIcons2[2] = new ImageIcon("images/2/3.jpg");
        // tabIcons2[3] = new ImageIcon("images/2/4.jpg");
        // tabIcons2[4] = new ImageIcon("images/2/5.jpg");

        tabIcons1[0] = new ImageIcon("pvz2/plants/1.png");
        tabIcons1[1] = new ImageIcon("pvz2/plants/2.png");
        tabIcons1[2] = new ImageIcon("pvz2/plants/3.png");
        tabIcons1[3] = new ImageIcon("pvz2/plants/4.png");

        tabIcons2[0] = new ImageIcon("pvz2/zombies/1.png");
        tabIcons2[1] = new ImageIcon("pvz2/zombies/2.png");
        tabIcons2[2] = new ImageIcon("pvz2/zombies/3.png");
        tabIcons2[3] = new ImageIcon("pvz2/zombies/4.png");
        tabIcons2[4] = new ImageIcon("pvz2/zombies/5.png");

        button1 = new JButton(tabIcons1[i]);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton(tabIcons2[j]);
        button2.setFocusable(false);
        button2.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2, 10, 10));
        // panel.setBackground(Color.GRAY);
        panel.setBounds(5, 5, 780, 380);

        panel.add(button1);
        panel.add(button2);

        fenetre.add(panel);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

    }

    public static void main(String[] agrs) throws UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        new ImageSwitcherGrid();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            i += 1;
            if (i == tabIcons1.length) {
                i = 0;
            }
            button1.setIcon(tabIcons1[i]);
        }

        if (e.getSource() == button2) {
            j += 1;
            if (j == tabIcons2.length) {
                j = 0;
            }
            button2.setIcon(tabIcons2[j]);
        }

    }
}
