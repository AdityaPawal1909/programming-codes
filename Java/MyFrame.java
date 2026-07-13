import java.awt.*;

public class MyFrame extends Frame {

    MyFrame() {
        Label lb = new Label("Hello World");
        lb.setBounds(50, 100, 200, 30);

        add(lb);              // add label
        setSize(400, 400);
        setLayout(null);      // required for setBounds
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
