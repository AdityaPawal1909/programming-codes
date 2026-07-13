
import java.awt.*;

public class MenuDemo extends Frame {
    public MenuDemo(){
        MenuBar m = new MenuBar();
        setMenuBar(m);
        Menu files = new Menu("Colors");
        Menu exit = new Menu("Exit");
        m.add(files);
        m.add(exit);
        setTitle("Menu Demo");
        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}
