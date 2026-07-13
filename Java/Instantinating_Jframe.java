import java.awt.*;
import javax.swing.*;

public class Instantinating_Jframe {
    JFrame f;
    Instantinating_Jframe() {
        f = new JFrame("Mywindow");
        JButton b = new JButton("Hello");
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new Instantinating_Jframe();
    }
    
}
