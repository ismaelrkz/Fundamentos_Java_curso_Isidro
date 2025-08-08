import java.util.Scanner;

public class BEE1038V2 {
    public BEE1038V2() {
    }

    public static void main(String[] var0) {
        double var3 = (double)0.0F;
        Scanner var5 = new Scanner(System.in);
        int var1 = var5.nextInt();
        int var2 = var5.nextInt();
        switch (var1) {
            case 1 -> var3 = (double)var2 * (double)4.0F;
            case 2 -> var3 = (double)var2 * (double)4.5F;
            case 3 -> var3 = (double)var2 * (double)5.0F;
            case 4 -> var3 = (double)var2 * (double)2.0F;
            case 5 -> var3 = (double)var2 * (double)1.5F;
            default -> System.out.println("Valor inválido");
        }

        System.out.printf("Total: R$ %.2f\n", var3);
        var5.close();
    }
}