package lista01.vetores;

import java.util.Scanner;
public class q12_Vetores {
    public static void main (String []args){
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10];
    int contador = 0;

    while ( contador < 10){
        System.out.println("Digite um número");
        int num = scanner.nextInt();
        boolean rep = false;

        for (int i = 0; i < contador; i++) {
            if (numeros[i] == num){
                rep = true;
                break;
            }
        }
        if (rep){
            System.out.println("Número já digitado. Digite outro diferente");
        }else {
            numeros[contador] = num;
            contador++;
        }
    }
        System.out.println("\nNúmeros digitados");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
