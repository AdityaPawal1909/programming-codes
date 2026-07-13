import java.awt.*;

class Filedialog {
    public static void main(String[] args) {

        Frame f = new Frame("File Dialog Demo");
        f.setSize(400, 400);
        f.setVisible(true);

        FileDialog fd = new FileDialog(f, "Select File");
        fd.setVisible(true);
    }
}