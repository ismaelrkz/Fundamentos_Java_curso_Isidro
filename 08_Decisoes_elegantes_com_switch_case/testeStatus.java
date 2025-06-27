import java.util.Scanner;

public class testeStatus{

    public static void main(String args[]){
        
        int codigoPedido;
        String status;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o codigo do pedido: ");

        codigoPedido = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite o status do pedido: " + codigoPedido);

        status = teclado.nextLine();

        switch(status){
            case "Novo":
            case "novo":
            case "N":
            case "n":
                System.out.println("Status do pedido " + codigoPedido + ": Novo");
                break;
            case "Separado":
            case "separado":
            case "S":
            case "s":
                System.out.println("Status do pedido " + codigoPedido + ": Separado");
                break;
            case "Finalizado":
            case "finalizado":
            case "F":
            case "f":
                System.out.println("Status do pedido " + codigoPedido + ": Finalizado");
                break;
            default:
                System.out.println("Status inválido");
        }

        teclado.close();

    }

}