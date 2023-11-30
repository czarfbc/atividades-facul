import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // double alturaBob = 1.50;
        // double alturaSmith = 1.49;
        // int crescimentoBob = 2;
        // int crescimentoSmith = 3;
        // int anos = 0;

        // while (alturaSmith < alturaBob) {
        // alturaBob += (double) crescimentoBob / 100;
        // alturaSmith += (double) crescimentoSmith / 100;
        // anos++;
        // }
        // JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos para
        // que Smith seja maior que Bob.");
        String kk = JOptionPane.showInputDialog(null, "altura");
        int altura = 0;// Defina a altura do triângulo aqui
        altura = Integer.parseInt(kk);

        for (int linha = altura; linha >= 1; linha--) {
            // Imprima espaços em branco à esquerda
            for (int espaco = 1; espaco <= altura - linha; espaco++) {
                System.out.print(" ");
            }

            // Imprima asteriscos
            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }

            // Mova para a próxima linha
            System.out.println();
        }
    }
}
