import javax.swing.*;

public class Combobox extends JFrame{
    public Combobox(){
    String Country[] = {"India", "Aus", "U.S.A","England","NewZealand"};
    JComboBox c = new JComboBox(Country);
    c.setBounds(50,50,90,20);
    add(c);
    setLayout(null);
    setSize(400,500);
    setVisible(true);
    }
    public static void main(String[] args) {
        new Combobox();
    }
}
