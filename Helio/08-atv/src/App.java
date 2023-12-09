import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // ============================1============================//
        // double[] valor = new double[10];
        // String num1 = "";

        // for (int i = 0; i <= 9; i++) {
        // String valor1 = JOptionPane.showInputDialog("Digite o valor " + (i + 1) +
        // ":");
        // valor[i] = Double.parseDouble(valor1);
        // }

        // for (int i = 9; i >= 0; i--) {
        // num1 += valor[i] + "\n";
        // }
        // JOptionPane.showMessageDialog(null, num1);
        // ==========================1==============================//

        // ==========================2==============================//
        // double[] gastos2020 = new double[6];
        // double[] gastos2021 = new double[6];
        // double[] somaGastos = new double[6];

        // for (int i = 0; i < 6; i++) {
        // gastos2020[i] = Double.parseDouble(
        // JOptionPane.showInputDialog("Digite o gasto de energia elétrica do mês " + (i
        // + 1) + " de 2020:"));
        // gastos2021[i] = Double.parseDouble(
        // JOptionPane.showInputDialog("Digite o gasto de energia elétrica do mês " + (i
        // + 1) + " de 2021:"));
        // somaGastos[i] = gastos2021[i] + gastos2020[i];
        // }

        // String soma = "Soma dos gastos de energia elétrica por mês:\n";
        // for (int i = 0; i < 6; i++) {
        // soma += "Mês " + (i + 1) + ": " + somaGastos[i] + "\n";
        // }

        // JOptionPane.showMessageDialog(null, soma);
        // ==========================2==============================//

        // ==========================4==============================//
        // int[][] matriz = new int[4][5];
        // int soma = 0;
        // String matriz1 = "";

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 5; j++) {
        // String valor1 = JOptionPane.showInputDialog(null, "Digite o valor da posição
        // [" + i + "][" + j + "]:");
        // matriz[i][j] = Integer.parseInt(valor1);
        // if (matriz[i][j] > 0) {
        // soma += matriz[i][j];
        // }
        // }
        // }

        // matriz1 += "A matriz digitada foi:\n";
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 5; j++) {
        // matriz1 += matriz[i][j] + " ";
        // }
        // matriz1 += "\n";
        // }

        // matriz1 += "A soma dos elementos positivos da matriz é: " + soma;

        // JOptionPane.showMessageDialog(null, matriz1);
        // ============================4============================//

        // ===========================5=============================//
        // int[][] vetor = new int[2][2];
        // int calculo = 0;

        // String mostrar = "";

        // for (int l = 0; l < 2; l++) {

        // mostrar = mostrar + "\n";

        // for (int c = 0; c < 2; c++) {

        // vetor[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os
        // valores"));

        // mostrar = mostrar + vetor[l][c] + " ";

        // }

        // }

        // calculo = (vetor[0][0] * vetor[1][1]) - (vetor[0][1] * vetor[1][0]);

        // JOptionPane.showMessageDialog(null, "Valores: " + mostrar +
        // "\nResultado do calculo com a formula (a11 * a22) - (a12 * a21): " +
        // calculo);
        // ===========================5=============================//

        // ==========================6==============================//
        int[][] matriz1 = new int[3][3];
        int[] calculo = new int[3];
        String mostrar = "Matriz \n";
        String resultado = "Soma das colunas:\n";

        for (int l = 0; l < 3; l++) {
            mostrar += "\n";
            for (int c = 0; c < 3; c++) {
                matriz1[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe os valores a" + "[" + (l + 1) + "]" + "[" + (c + 1) + "]"));
                mostrar += matriz1[l][c] + " ";
            }
        }

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                calculo[l] += matriz1[c][l];
            }
        }

        for (int i = 0; i < 3; i++) {
            resultado += "Coluna " + (i + 1) + ": " + calculo[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);
        JOptionPane.showMessageDialog(null, resultado);

        // calculo = (matriz1[0][0] + matriz1[1][0] + matriz1[2][0]);
        // calculo = (matriz1[0][1] + matriz1[1][1] + matriz1[2][1]);
        // calculo = (matriz1[0][2] + matriz1[1][2] + matriz1[2][2]);

        // calculo = (matriz1[0][2] + matriz1[1][2] + matriz1[2][2]);

        // ==========================6==============================//
    }
}
