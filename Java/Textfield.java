import java.awt.*;

class Textfield extends Frame{
        TextField t1,t2;
        Label l1,l2;

    Textfield(){
        setLayout(null);
        setSize(500,300);
        setVisible(true);
        l1 = new Label("Enter Username");
        l1.setBounds(50, 100, 100, 50);
        t1 = new TextField(12);
        t1.setBounds(150, 100, 100, 50);
        add(l1);
        add(t1);
        l2 = new Label("Enter Password");
        l2.setBounds(150,200,100,50);
        t2 = new TextField(8);
        t2.setBounds(150, 200, 100, 50);
        add(l2);
        add(t2);

    }
    public static void main(String[] args) {
        new Textfield();

    }
        
}