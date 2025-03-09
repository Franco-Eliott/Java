import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;
import java.awt.event.*;

public class Puzzele implements ActionListener {

    JFrame frame;
    JButton button1, button2, button3, button4;

    ImageIcon[] tabImageIcons = new ImageIcon[16];

    JPanel panel;

    int a = 0, b = 0, c = 0, d = 0;

    public Puzzele() {
        frame = new JFrame("👽👽👽");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);

        for (int i = 0; i < tabImageIcons.length; i++) {
            tabImageIcons[i] = new ImageIcon("pvz2/plants/" + String.valueOf(i) + ".png");
        }

        button1 = new JButton(tabImageIcons[a]);
        button1.addActionListener(this);
        button1.setFocusable(false);

        button2 = new JButton(tabImageIcons[b]);
        button2.addActionListener(this);
        button2.setFocusable(false);

        button3 = new JButton(tabImageIcons[c]);
        button3.addActionListener(this);
        button3.setFocusable(false);

        button4 = new JButton(tabImageIcons[d]);
        button4.addActionListener(this);
        button4.setFocusable(false);

        panel = new JPanel();
        panel.setBounds(25, 10, 550, 550);
        panel.setLayout(new GridLayout(2, 2, 5, 5));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException{
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        new Puzzele();
        // System.out.println("Hello");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            a++;
            if (a == tabImageIcons.length) {
                a = 0;
            }
            button1.setIcon(tabImageIcons[a]);
        }
        if (e.getSource() == button2) {
            b++;
            if (b == tabImageIcons.length) {
                b = 0;
            }
            button2.setIcon(tabImageIcons[b]);
        }
        if (e.getSource() == button3) {
            c++;
            if (c == tabImageIcons.length) {
                c = 0;
            }
            button3.setIcon(tabImageIcons[c]);
        }
        if (e.getSource() == button4) {
            d++;
            if (d == tabImageIcons.length) {
                d = 0;
            }
            button4.setIcon(tabImageIcons[d]);
        }
    }
}
