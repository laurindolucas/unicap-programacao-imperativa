public class recursividadesoma {
    public static int soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 5;
        int resultado = soma(numero);
        System.out.println("a soma de " + numero + " é: " + resultado); 
    }
}