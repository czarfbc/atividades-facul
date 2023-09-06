import javax.swing.JOptionPane;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * QUESTÃO 1
         * quadrado
         * double lado, res;
         * String sLado;
         * 
         * sLado = JOptionPane.showInputDialog(null, "Ensira um lado");
         * lado = Double.parseDouble(sLado);
         * res = lado * lado;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */
        /*
         * retangulo
         * double lado1, lado2, res;
         * String sLado1, sLado2;
         * 
         * sLado1 = JOptionPane.showInputDialog(null, "Ensira um lado");
         * lado1 = Double.parseDouble(sLado1);
         * sLado2 = JOptionPane.showInputDialog(null, "Ensira outro valor");
         * lado2 = Double.parseDouble(sLado2);
         * res = lado1 * lado2;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */
        /*
         * trapezio
         * double lado1, lado2, altura, soma, mult, res;
         * String sLado1, sLado2, sAltura;
         * 
         * sLado1 = JOptionPane.showInputDialog(null, "Ensira um lado");
         * lado1 = Double.parseDouble(sLado1);
         * 
         * sLado2 = JOptionPane.showInputDialog(null, "Ensira outro valor");
         * lado2 = Double.parseDouble(sLado2);
         * 
         * sAltura = JOptionPane.showInputDialog(null, "Ensira uma altura");
         * altura = Double.parseDouble(sAltura);
         * 
         * soma = lado1 + lado2;
         * mult = soma * altura;
         * 
         * res = mult * 0.5;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */
        /*
         * circulo
         * double raio, pow, res;
         * String sRaio;
         * 
         * sRaio = JOptionPane.showInputDialog(null, "Digite um numero");
         * raio = Double.parseDouble(sRaio);
         * 
         * pow = Math.pow(raio, 2);
         * res = pow * 3.14;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */
        /*
         * triangulo retangulo
         * double lado1, lado2, soma, res;
         * String sLado1, sLado2;
         * 
         * sLado1 = JOptionPane.showInputDialog(null, "Digite um numero");
         * lado1 = Double.parseDouble(sLado1);
         * 
         * sLado2 = JOptionPane.showInputDialog(null, "Digite um numero");
         * lado2 = Double.parseDouble(sLado2);
         * 
         * soma = lado1 + lado2;
         * 
         * res = soma * 0.5;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 2
         * double salario, res;
         * String sSalario;
         * 
         * sSalario = JOptionPane.showInputDialog(null, "Digite uma salario");
         * salario = Double.parseDouble(sSalario);
         * 
         * res = salario * 0.86;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 3
         * double salario, res;
         * String sSalario;
         * 
         * sSalario = JOptionPane.showInputDialog(null, "Digite uma salario");
         * salario = Double.parseDouble(sSalario);
         * 
         * res = salario * 1.05;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 4
         * double peso, altura, pow, res;
         * String sPeso, sAltura;
         * 
         * sPeso = JOptionPane.showInputDialog(null, "Digite peso");
         * sAltura = JOptionPane.showInputDialog(null, "Digite altura");
         * 
         * peso = Double.parseDouble(sPeso);
         * altura = Double.parseDouble(sAltura);
         * 
         * pow = Math.pow(altura, 2);
         * 
         * res = peso / pow;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 5
         * double prBruto, imposto, lucro, mult, res;
         * String sPrbruto, sImposto, sLucro;
         * 
         * sPrbruto = JOptionPane.showInputDialog(null, "Digite preço bruto");
         * sLucro = JOptionPane.showInputDialog(null, "Digite % lucro em 1.%");
         * sImposto = JOptionPane.showInputDialog(null, "Digite % imposto em 1.%");
         * 
         * prBruto = Double.parseDouble(sPrbruto);
         * lucro = Double.parseDouble(sLucro);
         * imposto = Double.parseDouble(sImposto);
         * 
         * mult = prBruto * lucro;
         * res = mult * imposto;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 6
         * double a, b, c, delta, raiz, pow, cima1, cima2, res1, res2;
         * String sA, sB, sC;
         * 
         * sA = JOptionPane.showInputDialog(null, "Digite 1 valor");
         * sB = JOptionPane.showInputDialog(null, "Digite 2 valor");
         * sC = JOptionPane.showInputDialog(null, "Digite 3 valor");
         * 
         * a = Double.parseDouble(sA);
         * b = Double.parseDouble(sB);
         * c = Double.parseDouble(sC);
         * 
         * pow = Math.pow(b, 2);
         * delta = pow - 4 * a * c;
         * 
         * raiz = Math.sqrt(delta);
         * 
         * cima1 = -b + raiz;
         * cima2 = -b - raiz;
         * 
         * res1 = cima1 / 2 * a;
         * res2 = cima2 / 2 * a;
         * 
         * JOptionPane.showMessageDialog(null, "resultado1" + res1);
         * JOptionPane.showMessageDialog(null, "resultado2" + res2);
         */

        /*
         * QUESTÃO 7
         * 
         * int[][] matriz1 = {
         * { 1, 2, 3 },
         * { 4, 5, 6 },
         * { 7, 8, 9 }
         * };
         * 
         * int[][] matriz2 = {
         * { 9, 8, 7 },
         * { 6, 5, 4 },
         * { 3, 2, 1 }
         * };
         * 
         * int[][] matrizDiferenca = new int[3][3];
         * 
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 3; j++) {
         * matrizDiferenca[i][j] = matriz1[i][j] - matriz2[i][j];
         * }
         * }
         * 
         * StringBuilder stringMatriz = new StringBuilder("Matriz de diferença:\n");
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 3; j++) {
         * stringMatriz.append(matrizDiferenca[i][j]).append(" ");
         * }
         * stringMatriz.append("\n");
         * }
         * 
         * JOptionPane.showMessageDialog(null, stringMatriz.toString());
         */
        /*
         * QUESTÃO 8
         * int n1, n2, res;
         * String sN1, sN2;
         * sN1 = JOptionPane.showInputDialog(null, "Digite 1 valor negativo");
         * sN2 = JOptionPane.showInputDialog(null, "Digite 1 valor negativo");
         * 
         * n1 = Integer.parseInt(sN1);
         * n2 = Integer.parseInt(sN2);
         * 
         * res = n1 - n2;
         * 
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 9
         * int n1;
         * double res;
         * String sN1;
         * 
         * sN1 = JOptionPane.showInputDialog(null, "Digite um numero positivo");
         * n1 = Integer.parseInt(sN1);
         * 
         * res = Math.sqrt(n1);
         * JOptionPane.showMessageDialog(null, res);
         */

        /*
         * QUESTÃO 10
         * Calendar cal = Calendar.getInstance();
         * int horaAtual = cal.get(Calendar.HOUR_OF_DAY);
         * 
         * if (horaAtual >= 7 && horaAtual <= 10) {
         * JOptionPane.showMessageDialog(null, "Bom dia!");
         * } else {
         * JOptionPane.showMessageDialog(null, "Boa tarde!");
         * }
         */
    }
}
