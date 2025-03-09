import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NxN_images implements ActionListener {

    JFrame frame;
    JButton okButton;

    JTextField numCellule;
    JLabel label;

    ImageIcon[] tabImageIcons = new ImageIcon[16];

    Font font = new Font(null, Font.ITALIC, 20);

    int n;
    JButton[] tabButtons;
    Random rand = new Random();
    int numRandom;
    int index;

    public NxN_images() {
        frame = new JFrame("NxN_images");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLayout(null);

        label = new JLabel("What's n ? (n*n)");
        label.setBounds(25, 25, 250, 25);
        label.setFont(font);

        numCellule = new JTextField(5);
        numCellule.setBounds(25, 60, 250, 50);
        numCellule.setFont(font);

        okButton = new JButton("Ok");
        okButton.addActionListener(this);
        okButton.setFocusable(false);
        okButton.setBounds(100, 125, 100, 50);
        okButton.setFont(font);

        frame.add(numCellule);
        frame.add(okButton);
        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void NxN_images (int n) {
        JFrame frameNxN = new JFrame("Grilles " + n + "*" + n);
        frameNxN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameNxN.setSize(100 * n, 100 * n);
        frameNxN.setLayout(new GridLayout(n, n, 5, 5));

        for (int i = 0; i < tabImageIcons.length; i++) {
            tabImageIcons[i] = new ImageIcon("pvz2/plants/" + String.valueOf(i) + ".png");
        }

        tabButtons = new JButton[n * n];

        for (int i = 0; i < tabButtons.length; i++) {
            numRandom = rand.nextInt(15);
            tabButtons[i] = new JButton(tabImageIcons[numRandom]);
            tabButtons[i].addActionListener(this);
            tabButtons[i].setFocusable(false);
        }

        for (int i = 0; i < tabButtons.length; i++) {
            frameNxN.add(tabButtons[i]);
        }

        frameNxN.setLocationRelativeTo(null);
        frameNxN.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == okButton) {
            try {

                n = Integer.parseInt(numCellule.getText());

                if (n < 0) {
                    numCellule.setText("");
                } else if (n > 0) {
                    frame.dispose();
                    NxN_images(n);
                    numCellule.setText("");
                }

            }
            catch (NumberFormatException ex) {
                System.out.println("Format incorrect");
                numCellule.setText("");
            }
            catch (NullPointerException ex) {
                System.out.println("NullPointerException");
            }
        }

        for (int i = 0; i<= n*n; i++) {
            if (e.getSource() == tabButtons[i]) {
                index++;
                if (index == tabImageIcons.length) {
                    index = 0;
                }
                tabButtons[i].setIcon(tabImageIcons[index]);
            }
        }
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        new NxN_images();
    }
}