package lista01.vetores;
import java.util.Scanner;
public class q01_Vetores {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[6];

        for(int i = 0; i < 6; i++){
            System.out.println("Digite um valor");
            a[i] = scanner.nextInt();
        }

        int soma = a[0] + a[1] + a[5];
        System.out.println("a soma é:" + " " + soma);

        a[4] = 100;
       for(int num : a){
           System.out.println(num);
       }
    }


}
