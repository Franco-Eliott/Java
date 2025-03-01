import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exo1b implements ActionListener{

    JFrame fenetre;
    JButton button;
    ImageIcon[] imageIcons = new ImageIcon [8];

    int i = 0;

    public Exo1b () {
        fenetre = new JFrame("Etape 10 du TD");

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 400);
        fenetre.setLayout(null);


        imageIcons[0] = new ImageIcon("image/1.gif");
        imageIcons[1] = new ImageIcon("image/2.gif");
        imageIcons[2] = new ImageIcon("image/3.gif");
        imageIcons[3] = new ImageIcon("image/4.gif");
        imageIcons[4] = new ImageIcon("image/5.gif");
        imageIcons[5] = new ImageIcon("image/6.gif");
        imageIcons[6] = new ImageIcon("image/7.gif");
        imageIcons[7] = new ImageIcon("image/8.gif");

        button = new JButton(imageIcons[i]);
        button.setFocusable(false);
        button.setBounds(25, 25, 450, 325);
        button.setBackground(Color.WHITE);
        button.addActionListener(this);

        fenetre.add(button);

        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            i++;
            if (i == imageIcons.length) {
                i = 0;
            }
            button.setIcon(imageIcons[i]);
        }
    }

    public static void main (String [] args) {
        new Exo1b();
    }
}

