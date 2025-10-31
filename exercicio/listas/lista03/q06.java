package lista03;
import java.util.Scanner;

public class q06 {
    public static double[] insertion(double[] v, int n) {
        int i, j = 1;
        double aux;
        while (j < n) {
            aux = v[j];
            i = j - 1;
            while (i >= 0 && v[i] > aux) {
                v[i + 1] = v[i];
                i--;
            }
            v[i + 1] = aux;
            j++;
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de seções: ");
        int p = sc.nextInt();

        while (p < 1 || p > 100) {
            System.out.println("Erro: o número de seções deve estar entre 1 e 100.");
            System.out.print("Digite novamente: ");
            p = sc.nextInt();
        }

        double[][] precosLivros = new double[p][];

        for (int i = 0; i < p; i++) {
            System.out.print("\nDigite o número de livros da seção " + (i + 1) + ": ");
            int n = sc.nextInt();

            while (n < 1 || n > 1000) {
                System.out.println("Erro: o número de livros deve estar entre 1 e 1000.");
                System.out.print("Digite novamente: ");
                n = sc.nextInt();
            }

            precosLivros[i] = new double[n];
            System.out.println("Digite os preços dos livros da seção " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                precosLivros[i][j] = sc.nextDouble();
            }

            insertion(precosLivros[i], n);
        }

        for (int i = 0; i < p; i++) {
            System.out.print("Preços ordenados da seção " + (i + 1) + ": ");
            for (int j = 0; j < precosLivros[i].length; j++) {
                System.out.printf("%.2f", precosLivros[i][j]);
                if (j < precosLivros[i].length - 1) System.out.print(" ");
            }

            double menor = precosLivros[i][0];
            double maior = precosLivros[i][precosLivros[i].length - 1];

            System.out.printf("%nPreço mais barato: %.2f%n", menor);
            System.out.printf("Preço mais caro: %.2f%n%n", maior);
        }
    }
}

