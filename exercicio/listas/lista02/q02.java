package lista02;
import java.util.Scanner;
public class q02 {

    public static int[] contarVotos(int[] votos){
        int[] candidatos = new int[5];
        int[] contagem = new int[candidatos.length];
        for (int i = 0; i < votos.length; i++) {
            int voto = votos[i];

            if (voto >= 0 && voto < contagem.length) {
                contagem[voto]++;
                System.out.print(contagem[i] + " ");
            } else {
                System.out.println("Aviso: Voto '" + voto + "' é inválido e foi descartado.");
            }
        }
        return contagem;

    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[20];

        for(int i = 0; i < votos.length; i++){
            System.out.println("Digite um número de 0 a 4");
            votos[i] = scanner.nextInt();
        }

    }
}
