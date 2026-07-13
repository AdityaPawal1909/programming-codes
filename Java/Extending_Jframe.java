import java.awt.*;
import javax.swing.*;

public class Extending_Jframe extends JFrame{
    
    Extending_Jframe() {
        
        JButton b = new JButton("Hello");
        add(b);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Mywindow");
        new Extending_Jframe();
    }
    
}
