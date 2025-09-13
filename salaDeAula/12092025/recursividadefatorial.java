public class recursividadefatorial {
    public static int pot(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * pot(x, n - 1);
        }
    }
    public static void main(String[] args) {
        int numeroX = 3;
        int numeroN = 4;
        int resultado = pot(numeroX, numeroN);
        System.out.println("A potencia de " + numeroX + " e " + numeroN + " é: " + resultado); 
    }
}