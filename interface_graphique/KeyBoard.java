import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class KeyBoard {

    JFrame frame;
    JButton[] buttons = new JButton[10];
    JButton equalButton, mulButton, addButton, sudButton;

    JPanel panel;

    Font font = new Font(null, Font.ITALIC, 30);

    public KeyBoard () {

        frame = new JFrame();
        frame.setSize(500, 500);

        for (int i=0; i<buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].setFont(font);
            buttons[i].setFocusable(false);
        }

        equalButton = new JButton("=");
        equalButton.setFont(font);
        equalButton.setBackground(Color.ORANGE);
        equalButton.setFocusable(false);
        
        mulButton = new JButton("*");
        mulButton.setFont(font);
        mulButton.setFocusable(false);

        addButton = new JButton("+");
        addButton.setFont(font);
        addButton.setFocusable(false);

        sudButton = new JButton("-");
        sudButton.setFont(font);
        sudButton.setFocusable(false);

        panel = new JPanel();
        // panel.setBackground(Color.gray);
        panel.setLayout(new GridLayout(3, 4, 10, 10));
        panel.setBounds(50, 25, 400, 300);

        panel.add(buttons[0]);
        panel.add(buttons[3]);
        panel.add(buttons[6]);
        panel.add(buttons[9]);
        panel.add(buttons[1]);
        panel.add(buttons[4]);
        panel.add(buttons[7]);
        panel.add(addButton);
        panel.add(buttons[2]);
        panel.add(buttons[5]);
        panel.add(buttons[8]);
        panel.add(sudButton);

        mulButton.setBounds(50, 350, 90, 90);
        frame.add(mulButton);

        equalButton.setBounds(150, 350, 180, 90);
        frame.add(equalButton);


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        new KeyBoard(); 
    }
    
}
