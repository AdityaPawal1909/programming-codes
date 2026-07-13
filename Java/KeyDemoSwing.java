import java.awt.event.*;
import javax.swing.*;

public class KeyDemoSwing extends JFrame implements KeyListener {

    JLabel l1, l2, l3;

    KeyDemoSwing()
    {
        l1 = new JLabel();
        l1.setBounds(100,100,200,30);

        l2 = new JLabel();
        l2.setBounds(100,140,200,30);

        l3 = new JLabel();
        l3.setBounds(100,180,200,30);

        add(l1);
        add(l2);
        add(l3);

        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addKeyListener(this);

        // Important: allow frame to receive keyboard focus
        setFocusable(true);
        requestFocus();
    }

    public void keyTyped(KeyEvent e)
    {
        l1.setText("Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e)
    {
        l2.setText("Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e)
    {
        l3.setText("Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyDemoSwing();
    }
}