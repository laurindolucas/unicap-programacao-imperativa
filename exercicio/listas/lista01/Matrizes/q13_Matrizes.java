package lista01.Matrizes;

import java.util.Scanner;
public class q13_Matrizes {
    public static void main (String []args){
    Scanner scanner = new Scanner(System.in);

    int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        System.out.println("Digite a quantidade de ingressos que deseja comprar");
        int quantidadeIngressos  = scanner.nextInt();

        for (int i = 0; i < quantidadeIngressos; i++) {
            System.out.println("Digite a fileira");
            int fileira = scanner.nextInt();
            System.out.println("Digite a coluna");
            int coluna = scanner.nextInt();

            int f = fileira - 1;
            int c = coluna -1;

            if (teatro[f][c] == -1){
                teatro[f][c] = 1;
            }else {
                System.out.println("poltrona já foi vendida");
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j] + " ");

            }
            System.out.println();
        }
    }
}
