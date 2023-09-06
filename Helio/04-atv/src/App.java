import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int idade;
        String s_idade, sexo;

        sexo = JOptionPane.showInputDialog(null, "digite o sexo");
        s_idade = JOptionPane.showInputDialog(null, "digite a idade");
        idade = Integer.parseInt(s_idade);

        if (idade > 0 && idade < 100) {
            if (idade >= 18) {
                if (sexo.equals("m")) {
                    JOptionPane.showMessageDialog(null, "masculino > 18");
                }
            } else {
                JOptionPane.showMessageDialog(null, "> 18");
            }
        } else {
            JOptionPane.showMessageDialog(null, "idade invalida");
        }
    }
}
