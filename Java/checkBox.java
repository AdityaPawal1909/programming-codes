import java.awt.*;

public class checkBox extends Frame{

    Checkbox cb1,cb2;
    checkBox() {
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setTitle("CheckBox");
        cb1 = new Checkbox("Java",false);
        cb2 = new Checkbox("Python",false);
        cb1.setBounds(100,80,70,70);
        cb2.setBounds(200,80,70,70);
        add(cb1);
        add(cb2);
    }

    public static void main(String[] args) {
        checkBox c = new checkBox();
    }
    
}