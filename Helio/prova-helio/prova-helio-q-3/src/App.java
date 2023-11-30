import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // 3 //
        int sim = 0, nao = 0, sim_m = 0;
        String s_pesquisa, s_sexo;
        for (int i = 0; i < 10; i++) {
            s_sexo = JOptionPane.showInputDialog(null, "Digite (m) ou (h)");
            s_pesquisa = JOptionPane.showInputDialog(null, "Gostou (n) ou (s)");

            if (s_pesquisa.equalsIgnoreCase("s")) {
                sim++;
            }
            if (s_pesquisa.equalsIgnoreCase("n")) {
                nao++;
            }
            if (s_sexo.equalsIgnoreCase("m") && s_pesquisa.equalsIgnoreCase("s")) {
                sim_m++;
            }
        }

        JOptionPane.showMessageDialog(null, "Sim: " + sim);
        JOptionPane.showMessageDialog(null, "Não: " + nao);
        JOptionPane.showMessageDialog(null, "Sim Mulheres: " + sim_m);

    }
}
