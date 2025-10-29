package lista03;
import java.util.Scanner;
public class q03 {

    public static int[] busca(int [] v, int obj){
        int ini, meio, fim;
        ini = 0;
        fim = v.length - 1;
        int passos = 0;
        while( ini <= fim){
            passos++;
            meio = (ini + fim)/2;
            if (v[meio] == obj) {
                return new int[]{meio, passos};
            }
            else if (v[meio] > obj) {
                fim = meio - 1;
            }else if (v[meio] < obj){
                ini = meio + 1;
            }
        }
        return new int[]{-1, passos};
        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tamV = scanner.nextInt();

        int [] v = new int[tamV];
        System.out.println("Digte os elementos do vetor");
        for(int i = 0; i < tamV; i++){
            int valor = scanner.nextInt();
            if (i > 0 && valor < v[i - 1]) {
                System.out.println("Erro: o vetor deve ser digitado em ordem crescente!");
                i--;
                continue;
            }
            v[i] = valor;
        }
        System.out.println("Digte o número que deseja buscar");
        int obj = scanner.nextInt();

        int [] resultado = busca(v, obj);

        if(resultado[0]== -1){
           System.out.println("-1");
        }else{
            System.out.print(resultado[0] + " ");
            System.out.print(resultado[1]);
        }
    }
}
