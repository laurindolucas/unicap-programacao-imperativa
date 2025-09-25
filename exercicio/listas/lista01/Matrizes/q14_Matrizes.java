package lista01.Matrizes;

import java.util.Scanner;
public class q14_Matrizes {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int numAlunos = scanner.nextInt();
        scanner.nextLine();
        String[] nomeAluno = new String[numAlunos];
        String[][] frequencia = new String[numAlunos][30];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomeAluno[i] = scanner.nextLine();

            for (int j = 0; j < 30 ; j++) {
                frequencia[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0; i < numAlunos; i++) {
            int faltas = 0;
            StringBuilder diasFaltados = new StringBuilder();

            for (int j = 0; j < 30; j++) {
                if (frequencia[i][j].equalsIgnoreCase("f")){
                    faltas++;
                    diasFaltados.append( j + 1).append(" ");
                }
            }
            if (faltas > 10){
                System.out.println(nomeAluno[i] + " - dias: " + diasFaltados.toString());
            }
        }
    }
}
