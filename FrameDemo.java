import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.ActionEvent;

public class FrameDemo extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1;

    FrameDemo() {
        Frame f = new Frame();
        l1 = new Label("enter the first no");
        l2 = new Label("enter teh second number");
        l3 = new Label("addition");
        t1 = new TextField(100);
        t2 = new TextField(100);
        t3 = new TextField(100);
        b1 = new Button("submit");
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        f.add(b1);
        f.setSize(300, 300);
        f.add(b1);
        b1.addActionListener(this);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        t3.setText("c");
    }

    public static void main(String[] args) {
        FrameDemo f = new FrameDemo();
    }
}
