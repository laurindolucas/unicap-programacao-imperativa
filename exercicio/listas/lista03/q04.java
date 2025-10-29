package lista03;
import java.util.Scanner;
public class q04 {

    public static String buscarTitulo(String [][] titulos, String busca ){
        int linhas = titulos.length;
        int colunas = titulos[0].length;

        for(int i = 0; i < colunas; i++){
            int ini, meio, fim;
            ini = 1;
            fim = linhas - 1;

            while(ini <= fim){
                meio = (ini + fim) / 2;
                int cmp = titulos[meio][i].compareTo(busca);

                if (cmp == 0) {
                    String genero = titulos[0][i];
                    return genero;
                } else if (cmp < 0) {
                    ini = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        return "Não encontrado";
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de colunas que deseja: ");
        int c = scanner.nextInt();

        System.out.println("Digite a quantidade de linhas que deseja: ");
        int l = scanner.nextInt();

        scanner.nextLine();

        String [][] titulos = new String[l + 1][c];

        for(int i = 0; i < c; i++){
            System.out.println("Digite o gênero de cada coluna: ");
            titulos[0][i] = scanner.nextLine();
        }

        for(int i = 0; i < c; i++){
            for(int j = 1; j < l + 1; j++){
                System.out.println("Digite o filme " + j + " do gênero " + titulos[0][i] + ":");
                titulos[j][i] = scanner.nextLine();
            }
        }

        System.out.println("Digite o nome correto do livro que deseja: ");
        String busca =  scanner.nextLine();

        String resultado = buscarTitulo(titulos, busca);
        System.out.println(resultado);
    }
}
