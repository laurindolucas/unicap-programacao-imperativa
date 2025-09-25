package lista01.vetores;
import java.util.Scanner;

public class q05_Vetores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[20];
        for(int i = 0; i < v.length; i++){
            System.out.print("Digite um valor: ");
            v[i] = scanner.nextInt();
        }
        System.out.println("==========ímpares==========");
        for(int numimpar : v){
            if( numimpar % 2 == 1 ){
                System.out.println(numimpar);
            }
        }
            System.out.println("==========Pares==========");
              for(int numpar : v){
                  if(numpar % 2 == 0){
                      System.out.println(numpar);
                  }
              }
    }
}

