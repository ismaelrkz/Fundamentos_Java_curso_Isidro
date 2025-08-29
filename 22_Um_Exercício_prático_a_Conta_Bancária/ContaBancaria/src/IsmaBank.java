import java.util.Scanner;

public class IsmaBank {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Conta c1 = new Conta(
                12345,
                0,
                "Ismael Reckziegel",
                "987654321"
                );

        double valor;
        int opcao;

        do {

            System.out.println("*** IsmaBank ***");
            System.out.println("1 - Verificar conta do titular / 2 - Deposito / 3 - Saque / -1 - Encerrar");
            opcao = keyboard.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println(c1.exibirInfoConta());
                    break;
                case 2:
                    valor = keyboard.nextDouble();
                    c1.depositar(valor);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque");
                    valor = keyboard.nextDouble();

                    if(c1.sacar(valor)){
                        System.out.println("Saque autorizado");
                    } else{
                        System.out.println("Saldo insuficiente");
                    }

                    break;
                case -1:
                    System.out.println("Obrigado por utilizar nossos servicos");
                    break;
                default:
                    System.out.println("Opcao Invalida!");

            }

        } while(opcao != -1);

        keyboard.close();
    }
}
