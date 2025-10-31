package lista03;
import java.util.Scanner;

public class q07 {
    public static int[] ordenacaoNotas(int[] v, int n) {
    int i, j, min, aux;
    for (i = 0; i < (n-1); i++)
    {
        min = i;
        for (j = (i+1); j < n; j++) {
            if(v[j] > v[min])
                min = j;
        }
        if (v[i] != v[min]) {
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
    }
    return v;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de avaliações que deseja fazer: ");
        int numAvaliacoes = scanner.nextInt();

        int[] v = new int [numAvaliacoes];

        for(int i = 0; i < numAvaliacoes; i++){
            System.out.println("Digite as avaliações: ");
            v[i] = scanner.nextInt();
        }

        int[] ordenado = ordenacaoNotas(v, v.length);
        System.out.print("Avaliacoes ordenadas: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(ordenado[i] + " ");

        }
        System.out.println();
        System.out.println("Melhor avaliacao: " + ordenado[0]);
        System.out.println("Pior avaliacao: " + ordenado[numAvaliacoes - 1]);
    }

}
