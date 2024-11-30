
import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class lecture4 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Madhuri");

        frame.setBounds(250, 100, 650, 550);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JTextField textField = new JTextField(" Enter the first name ");

        textField.setBounds(150, 50, 220, 30);

        frame.add(textField);

        JTextField textField1 = new JTextField(" Enter the last name ");

        textField1.setBounds(150, 100, 220, 30);

        frame.add(textField1);

        JTextArea textArea = new JTextArea(" Enter the address");

        textArea.setBounds(150, 150, 220, 30);

        frame.add(textArea);

        JTextField textField2 = new JTextField(" Enter the phone number ");

        textField2.setBounds(150, 200, 220, 30);

        frame.add(textField2);

        JButton button = new JButton(" Submit");

        button.setBounds(150, 300, 130, 30);

        frame.add(button);

        JTextArea display = new JTextArea();

        display.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(display);

        scrollPane.setBounds(150, 200, 300, 200);

        frame.add(scrollPane);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = textField.getText().trim();

                String name1 = textField1.getText().trim();

                String name2 = textField2.getText().trim();

                String NumbeString = textField2.getText().trim();

                display.append("First Name: " + name + "\n");

                display.append("Last Name: " + name1 + "\n\n");

                display.append("address Name: " + name2 + "\n\n");

                display.append("contact number: " + NumbeString + "\n\n");

            }
        });

        frame.setVisible(true);

    }

}
