import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 60; j++) {
                s += i + "min" + j + "seg\n";

            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
