package lista01.vetores;
import java.util.Scanner;
public class q02_Vetores {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[6];
        for(int i = 0; i < v.length; i++){
            System.out.print("Digite um número: ");
             v[i] = scanner.nextInt();
        }
        for(int num : v){
            System.out.println(num);
        }
    }
}
