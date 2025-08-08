import java.util.Scanner;

public class testeStatus {
    public testeStatus() {
    }

    public static void main(String[] var0) {
        Scanner var3 = new Scanner(System.in);
        System.out.println("Digite o codigo do pedido: ");
        int var1 = Integer.parseInt(var3.nextLine());
        System.out.println("Digite o status do pedido: " + var1);
        switch (var3.nextLine()) {
            case "Novo":
            case "novo":
            case "N":
            case "n":
                System.out.println("Status do pedido " + var1 + ": Novo");
                break;
            case "Separado":
            case "separado":
            case "S":
            case "s":
                System.out.println("Status do pedido " + var1 + ": Separado");
                break;
            case "Finalizado":
            case "finalizado":
            case "F":
            case "f":
                System.out.println("Status do pedido " + var1 + ": Finalizado");
                break;
            default:
                System.out.println("Status inválido");
        }

        var3.close();
    }
}
