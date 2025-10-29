package lista03;
import java.util.Scanner;

public class q01 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja buscar: ");
        int busca = scanner.nextInt();
        System.out.println("Digite o tamanho do vetor: ");
        int tamVetor = scanner.nextInt();

        int [] v = new int[tamVetor];
        System.out.println("Digite os valores do vetor: ");
        for(int i = 0; i < tamVetor; i++ ){
            v[i] = scanner.nextInt();
        }
        boolean encontrado = false;

        for(int j = 0; j < tamVetor; j++ ){
            if(v[j] == busca){
                System.out.println(j);
            }
        }

        if(!encontrado){
            System.out.println(-1);
        }
    }
}
