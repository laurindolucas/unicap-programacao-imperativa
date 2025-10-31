package lista03;
import java.util.Scanner;

public class q05 {
    public static int[] insertion(int[] v, int n) {
        int i, j = 1;
        int aux;
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

    public static double mediana(int[] v) {
        int n = v.length;
        if (n % 2 == 0)
            return (v[n / 2 - 1] + v[n / 2]) / 2.0;
        else
            return v[n / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int p = sc.nextInt();

        while (p < 1 || p > 100) {
            System.out.println("Erro: o número de produtos deve estar entre 1 e 100.");
            System.out.print("Digite novamente: ");
            p = sc.nextInt();
        }

        int[][] vendasProdutos = new int[p][];
        double[] medianas = new double[p];

        for (int i = 0; i < p; i++) {
            System.out.print("\nDigite o número de anos do produto " + (i + 1) + ": ");
            int n = sc.nextInt();

            while (n < 1 || n > 1000) {
                System.out.println("Erro: o número de anos deve estar entre 1 e 1000.");
                System.out.print("Digite novamente: ");
                n = sc.nextInt();
            }

            vendasProdutos[i] = new int[n];
            System.out.println("Digite as vendas anuais do produto " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                vendasProdutos[i][j] = sc.nextInt();
            }

            insertion(vendasProdutos[i], n);
            medianas[i] = mediana(vendasProdutos[i]);
        }

        for (int i = 0; i < p; i++) {
            System.out.print("Produto " + (i + 1) + " - Vendas ordenadas: ");
            for (int j = 0; j < vendasProdutos[i].length; j++) {
                System.out.print(vendasProdutos[i][j]);
                if (j < vendasProdutos[i].length - 1) System.out.print(" ");
            }
            System.out.printf("%nMediana das vendas do produto %d: %.1f%n%n", (i + 1), medianas[i]);

        }
    }
}
