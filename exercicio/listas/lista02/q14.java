package lista02;

public class q14 {

    public static boolean ehPrimo(int n, int divisor){
        if (n <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }

        return ehPrimo(n, divisor - 1);

    }
    public static void main(String [] args){
        int n = 29;
        boolean resultado = ehPrimo(n, n - 1);
        if (resultado) {
            System.out.println(n + " é primo!");
        } else {
            System.out.println(n + " não é primo!");
        }
    }
}
