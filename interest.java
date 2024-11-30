import java.awt.DisplayMode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class interest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("simple interest calculator");
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField1 = new JTextField("priciple amount");
        textField1.setBounds(150, 50, 200, 50);
        frame.add(textField1);

        JTextField textField2 = new JTextField("Intereset rate %");
        textField2.setBounds(150, 100, 200, 50);
        frame.add(textField2);

        JTextField textField3 = new JTextField("Total amount");
        textField3.setBounds(150, 150, 200, 50);
        frame.add(textField3);

        JTextField textField4 = new JTextField("Intereset amount");
        textField4.setBounds(150, 200, 200, 50);
        frame.add(textField4);

        JButton button = new JButton("submit");
        button.setBounds(100, 400, 200, 50);
        frame.add(button);

        JTextArea textArea = new JTextArea("clear");
        textArea.setBounds(100, 300, 200, 50);
        frame.add(textArea);

        JTextArea displArea = new JTextArea();

        displArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displArea);
        scrollPane.setBounds(150, 400, 300, 30);
        frame.add(scrollPane);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText().trim();
                String name1 = textField2.getText().trim();
                String name2 = textField3.getText().trim();
                String name3 = textField4.getText().trim();

                displArea.append("name" + name + name1 + name2 + name3);
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }

}
