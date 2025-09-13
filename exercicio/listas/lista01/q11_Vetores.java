import java.util.Scanner;
public class q11_Vetores {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        double[] v = new double[10];
        double soma = 0;
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            v[i] = scanner.nextDouble();
            soma += v[i];
        }
        double media = soma / 10;
        double somaQuadrados = 0;
        for (int i = 0; i < 10; i++) {
            somaQuadrados += Math.pow(v[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / (10 - 1));
        System.out.printf("Desvio Padrão: %.2f\n", desvioPadrao);
    }
}
