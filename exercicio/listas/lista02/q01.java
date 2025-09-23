package lista02;

public class q01 {

    public static double[] reajustarPrecos(double[] precos, double percentual) {
        double[] novosPrecos = new double[precos.length];
        for (int i = 0; i < precos.length; i++) {
            novosPrecos[i] = precos[i] + (precos[i] * percentual / 100.0);
        }
        return novosPrecos;
    }

    public static void main(String[] args) {
        double[] precos = {100.0, 50.0, 75.0, 30.0, 200.0, 120.0, 60.0, 80.0, 90.0, 40.0};
        double percentual = 10.0;

        double[] precosReajustados = reajustarPrecos(precos, percentual);

        System.out.print("{");
        for (int i = 0; i < precosReajustados.length; i++) {
            System.out.print(precosReajustados[i]);
            if (i < precosReajustados.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
