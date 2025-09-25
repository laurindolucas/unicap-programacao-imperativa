package lista00;
import java.util.Scanner;
public class q01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume: ");
        int volume = scanner.nextInt();

        if(volume >= 100){
            System.out.println("Max Volume");
        }else if((volume < 100) && (volume >75)){
            System.out.println("High Volume");
        }else if((volume <= 75) && (volume >25)){
            System.out.println("Medium Volume");
        }else if((volume <= 25) && (volume > 0)){
            System.out.println("low Volume");
        }else{
            System.out.println("Min Volume");
        }
    }
}
