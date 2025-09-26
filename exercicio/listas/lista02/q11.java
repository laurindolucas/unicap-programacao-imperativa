package lista02;

import java.util.Scanner;
public class q11 {
    public static int fatorial(int n){
       if( n == 0 || n == 1){
           return 1;
       }
       return n * fatorial(n - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        int n = scanner.nextInt();
        System.out.println("o fatorial de" + " " + n + " " + "é" + " " + fatorial(n));
    }
}
