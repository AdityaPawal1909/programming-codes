import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {

    AdapterDemo() {
        setSize(400, 500);
        setLayout(null);

        addMouseListener(new MyMouseAdapter(this));

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}

class MyMouseAdapter extends MouseAdapter {

    AdapterDemo frame;

    MyMouseAdapter(AdapterDemo frame) {
        this.frame = frame;
    }

    public void mouseClicked(MouseEvent me) {   // ✅ correct method name

        frame.setBackground(Color.BLACK);

        Label l = new Label("Mouse Clicked");
        l.setBounds(100, 100, 120, 50);

        frame.add(l);
        frame.repaint();
    }
}