package lista01.vetores;
import java.util.Scanner;
public class q03_Vetores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[10];
        for(int i = 0; i < v.length; i++){
            System.out.print("Digite um valor: ");
            v[i] = scanner.nextInt();
        }
        for(int num : v){
            if( num % 2 == 0 ){
                System.out.println(num);
            }
        }
    }

}
