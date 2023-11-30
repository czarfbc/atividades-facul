import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // 1 //
        int maiores = 0, menores = 0;
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(null, "escreva sua idade");
            int n_input = Integer.parseInt(input);
            if (n_input >= 18) {
                maiores++;
            } else {
                menores++;
            }
        }
        JOptionPane.showMessageDialog(null, "Maiores: " + maiores);
        JOptionPane.showMessageDialog(null, "Menores: " + menores);

    }
}
