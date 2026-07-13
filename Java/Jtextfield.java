import java.awt.*;
import javax.swing.*;

public class Jtextfield extends JFrame{
    public Jtextfield(){
        setLayout(new FlowLayout());
        JLabel l = new JLabel("TextField");
        add(l);
        JTextField t = new JTextField(40);
        add(t);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Jtextfield();
    }
}
