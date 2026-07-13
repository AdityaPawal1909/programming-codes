import java.awt.*;

class CheckBoxGroup  extends Frame{
    Checkbox c1,c2;
    CheckboxGroup c;
    CheckBoxGroup(){
        setLayout(null);
        setVisible(true);
        setSize(300,500);
        setTitle("hello");
        c1 = new Checkbox("Java",false, c);
        c1.setBounds(100, 100, 50, 50);
        add(c1);
        c2 = new Checkbox("Python",false, c);
        c2.setBounds(100, 200, 50, 50);
        add(c2);
    }
    public static void main(String[] args) {
        CheckBoxGroup c = new CheckBoxGroup();
    }
    
}