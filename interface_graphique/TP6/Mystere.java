
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Mystere implements ActionListener {

    JFrame window;
    JButton btnEnd, btnStart;
    JLabel lblResult, lblNbCoups;
    JTextField textField;
    JPanel panel;

    int nbrCoups = 0;

    Random rand = new Random();
    int number = rand.nextInt(10);
    int answer;

    Font font = new Font(null, Font.ITALIC, 20);

    public Mystere () {
        window = new JFrame("Mystere");
        window.setSize(400, 400);

        btnEnd = new JButton("End 👀 🚩");
        btnEnd.setFocusable(false);
        btnEnd.setFont(font);
        btnEnd.addActionListener(this);

        btnStart = new JButton("Start 👽 🏁");
        btnStart.setFocusable(false); 
        btnStart.setFont(font);
        btnStart.addActionListener(this);

        lblResult = new JLabel("Trouver un nombre entre 0 et 10");
        lblResult.setFont(font);
        lblNbCoups = new JLabel(String.valueOf(nbrCoups));
        lblNbCoups.setFont(font);

        textField = new JTextField(5);
        textField.setFont(font);

        textField.setBounds(50, 25, 150, 50);
        lblNbCoups.setBounds(250, 25, 100, 50);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBounds(50, 85, 300, 250);

        panel.add(lblResult);
        panel.add(btnStart);
        panel.add(btnEnd);

        window.add(textField);
        window.add(lblNbCoups);
        window.add(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setVisible(true);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        new Mystere();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnStart) {
            answer = Integer.parseInt(textField.getText());

            if (answer < number) {
                lblResult.setText("C'est plus 👆");
                textField.setText("");
                nbrCoups++;
                lblNbCoups.setText(String.valueOf(nbrCoups));
            }
            else if (answer > number) {
                lblResult.setText("C'est moins 👇");
                textField.setText("");
                nbrCoups++;
                lblNbCoups.setText(String.valueOf(nbrCoups));
            }
            else if (answer == number) {
                lblResult.setText("Vous avez trouve 🏆🏆🏆");
                nbrCoups++;
                lblNbCoups.setText(String.valueOf(nbrCoups + " 🏁"));
            }

            if (e.getSource() == btnEnd) {
                window.setDefaultCloseOperation(answer);
            }
        }
    }
    
}
