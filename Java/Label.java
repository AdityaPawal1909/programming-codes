import java.awt.*;

class  Label extends Frame{
    Label(String s)
    {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500,300);
        Label a = new Label("One");
        a.setBounds(50, 50, 100, 100);
        add(a);
    }
    public static void main(String[] args) {
        Label f = new Label("What is Labels");
    }
}