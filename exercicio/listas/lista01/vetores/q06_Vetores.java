package lista01.vetores;

import java.util.Scanner;

public class q06_Vetores {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] nomes = new String[2];
        int[] idades = new int[2];
        int soma = 0;

        for(int i = 0; i < nomes.length; i++){
            System.out.print("Digite o nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade: ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
            scanner.nextLine();
        }

        double media = (double) soma / idades.length;
        System.out.println("A média do grupo é de: " +  media);

        for(int j = 0; j < idades.length; j++){
            if(idades[j] > media){
                System.out.println(nomes[j] + " está acima da média com " + idades[j] + " anos");
            }
        }


    }
}
