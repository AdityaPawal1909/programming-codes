
import java.awt.*;

public class Menuex extends Frame{
    public Menuex(){
        MenuBar m = new MenuBar();
        setMenuBar(m);
        Menu files = new Menu("Colors");
        Menu exit = new Menu("Exit");
        m.add(files);
        m.add(exit);
        MenuItem m1 = new MenuItem("RED");
        files.add(m1);
        files.add(new MenuItem("GREEN"));
        files.addSeparator();
        files.add(new MenuItem("BLUE"));
        exit.add(new MenuItem("Close"));
        setTitle("Menu Demo");
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Menuex();
    }
}
