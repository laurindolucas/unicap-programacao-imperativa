package lista02;

import java.util.Scanner;
public class q11 {
    public static int fatorial(int n){
        int mult = 1;
        for( int i = 1; i <=n; i++){
            mult = mult * i;
        }
        return mult;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        int n = scanner.nextInt();
        System.out.println("o fatorial de" + " " + n + " " + "é" + " " + fatorial(n));
    }
}
