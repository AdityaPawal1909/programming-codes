import java.awt.*;
import javax.swing.*;

public class jlabel extends JFrame{
    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    public jlabel(){
        setLayout(null);
        setSize(new Dimension(400,300));
        l1.setText("Username");
        l1.setBounds(new Rectangle(40,55,80,95));
        l2.setText("Password");
        l2.setBounds(new Rectangle(40,95,80,95));
        add(l2,null);
        add(l1,null);

    }
    public static void main(String[] args) {
        jlabel f = new jlabel();
        f.setVisible(true);
    }
    
}
