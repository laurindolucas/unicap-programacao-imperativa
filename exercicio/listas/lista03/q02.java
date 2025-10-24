package lista03;
import java.util.Scanner;

public class q02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que quer cadastrar");
        int n = scanner.nextInt();
        scanner.nextLine();

        String [] livros = new String[n];
        for( int i = 0; i < n; i++){
            System.out.println("Digite o nome do Livro");
            livros[i] = scanner.nextLine();
        }

        System.out.println("Digite o livro que deseja encontrar");
        String busca = scanner.nextLine();

        for(int j = 0; j < n; j++){
            if(livros[j].toLowerCase().contains(busca.toLowerCase())){
                System.out.println(livros[j]);
            }

        }
    }
}
