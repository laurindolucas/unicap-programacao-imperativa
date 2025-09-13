public class recursividadesomaimpares {
        public static int fat(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n + fat(n - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 10;
        int resultado = fat(numero);
        System.out.println("a soma de " + numero + " é: " + resultado); 
    }
}
