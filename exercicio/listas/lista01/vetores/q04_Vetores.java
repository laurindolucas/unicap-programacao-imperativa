package lista01.vetores;
import java.util.Scanner;
public class q04_Vetores {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];

        for(int i = 0; i < nomes.length; i++){
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }
        for(int i =  nomes.length - 1 ; i >= 0; i--){
            System.out.println(nomes[i]);

        }
    }
}

