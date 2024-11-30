import javax.swing.*;
class lect3{
    public static void main(String[] args) {
        JFrame frame=new JFrame("madhuri");
        frame.setSize(10,20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button=new JButton("submit");
        button.setBounds(100, 100, 100, 100);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        


        
    }
}