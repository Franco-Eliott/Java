// package interface_graphique;

import javax.print.DocFlavor.STRING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form {
    
    JFrame frame;
    JLabel nomLabel, prenomLabel, sexLabel, nationaliteLabel;
    JTextField nomTextField, prenomTextField;
    JButton engButton;
    JRadioButton maleRadioButton, femeleRadioButton;

    // JPanel panel;

    String[] choices = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};
    // @SuppressWarnings("rawtypes")
    JComboBox listComboBox;

    Font font = new Font(null, Font.ITALIC, 25);

    public Form () {
        frame = new JFrame();
        frame.setSize(400, 500);

        // Label
        nomLabel = new JLabel("Nom");
        nomLabel.setFont(font);
        nomLabel.setBounds(40, 25, 100, 25);

        prenomLabel = new JLabel("Prenom");
        prenomLabel.setFont(font);
        prenomLabel.setBounds(40, 60, 100, 25);

        sexLabel = new JLabel("Sexe");
        sexLabel.setFont(font);
        sexLabel.setBounds(40, 95, 100, 25);

        nationaliteLabel = new JLabel("Nationalite");
        nationaliteLabel.setFont(font);
        nationaliteLabel.setBounds(40, 130, 140, 25);

        // TextField
        nomTextField = new JTextField();
        nomTextField.setFont(font);
        nomTextField.setBounds(150, 25, 120, 25);

        prenomTextField = new JTextField();
        prenomTextField.setFont(font);
        prenomTextField.setBounds(150, 60, 120, 25);


        // RadioButton
        maleRadioButton = new JRadioButton();
        maleRadioButton.setFont(font);
        maleRadioButton.setBackground(Color.BLUE);
        maleRadioButton.setBounds(100, 95, 25, 25);

        femeleRadioButton = new JRadioButton();
        femeleRadioButton.setFont(font);
        femeleRadioButton.setBackground(Color.PINK);
        femeleRadioButton.setBounds(150, 95, 25, 25);

        // Button
        engButton = new JButton("Enregistrer");
        engButton.setFocusable(false);
        engButton.setFont(font);
        engButton.setBounds(125, 400, 160, 40);
        engButton.setBackground(Color.GREEN);

        // Simple Dropdown menu in Java
        listComboBox = new JComboBox<String>(choices);
        listComboBox.setFont(font);
        listComboBox.setBounds(190, 130, 100, 25);

        // panel = new JPanel();
        // panel.setLayout(new GridLayout(4, 3, 5, 5));
        // panel.setBounds(25, 50, 300, 300);
        // panel.setBackground(Color.GRAY);

        // panel.add(nomLabel);
        // panel.add(nomTextField);
        // panel.add(prenomLabel);
        // panel.add(prenomTextField);
        // panel.add(sexLabel);
        // panel.add(maleRadioButton);
        // panel.add(femeleRadioButton);
        // panel.add(nationaliteLabel);


        frame.add(nomLabel);
        frame.add(nomTextField);
        frame.add(prenomLabel);
        frame.add(prenomTextField);
        frame.add(sexLabel);
        frame.add(maleRadioButton);
        frame.add(femeleRadioButton);
        frame.add(nationaliteLabel);
        frame.add(engButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Form();
        // try {
        //     new Form();
        // }
        // catch (NullPointerException e) {
        //     System.out.println("qwerty");
        // }
    }
}
