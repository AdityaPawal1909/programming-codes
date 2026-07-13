import java.awt.event.*;
import javax.swing.*;

public class MouseDemoSwing extends JFrame implements MouseListener {

    JLabel l1, l2, l3;

    MouseDemoSwing()
    {
        l1 = new JLabel();
        l1.setBounds(100,100,120,30);

        l2 = new JLabel();
        l2.setBounds(100,140,120,30);

        l3 = new JLabel();
        l3.setBounds(100,180,120,30);

        add(l1);
        add(l2);
        add(l3);

        setSize(300,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e)
    {
        l1.setText("Enter");
    }

    public void mouseExited(MouseEvent e)
    {
        l1.setText("Exit");
    }

    public void mouseClicked(MouseEvent e)
    {     
        l2.setText("Clicked");
    }

    public void mousePressed(MouseEvent e)
    {
        l2.setText("Pressed");
    }

    public void mouseReleased(MouseEvent e)
    {
        l3.setText("Released");
    }

    public static void main(String[] args) {
        new MouseDemoSwing();
    }
}