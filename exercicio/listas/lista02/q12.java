package lista02;

public class q12 {

    public static String decimalParaBinario(int n){
        if (n == 0) {
            return "0";
        } else {
            return Integer.toBinaryString(n);
        }
    }
    public static void main(String[] args) {
        int n = 65;
        String numeroBinario = decimalParaBinario(n);
        System.out.println("O número " + n + " em binário é: " + numeroBinario);
    }

}
