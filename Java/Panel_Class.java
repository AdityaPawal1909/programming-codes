import java.awt.*;

public class Panel_Class {

    Panel_Class() {
        Frame f = new Frame();
        Panel p = new Panel();
        p.setBounds(50, 100, 200, 200);
        p.setBackground(Color.CYAN);
        f.add(p);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Panel_Class p = new Panel_Class();
    }
    
}
