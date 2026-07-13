import java.awt.*;

public class Extending_Frame extends Frame {

    Extending_Frame() {
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setTitle("Hello");
    }
    public void paint(Graphics g) {
        g.drawString("Hello World", 50, 100);
    }
    public static void main(String[] args) {
        Extending_Frame f = new Extending_Frame();
    }
}
