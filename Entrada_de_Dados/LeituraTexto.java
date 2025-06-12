import java.util.Scanner;

public class LeituraTexto {

    public static void main(String args[]){

        String nome;
        int codigo;
        double salario;

        String primeiraParteNome, segundaParteNome;
        
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Digite seu código: ");
        codigo = Integer.parseInt(teclado.nextLine()); // conversão -> texto>inteiro
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite o valor do salario");
        salario = Double.parseDouble(teclado.nextLine());
        System.out.println("Seu código, nome e salário: " + codigo + " - " + nome + " - " + salario);
        */
        System.out.println("Digite seu nome completo (ex: Joao Silva):");
        primeiraParteNome = teclado.next(); // Usuário digita "Joao Silva" e Enter

        System.out.println("Primeira parte lida: " + primeiraParteNome); // Saída: "Joao"

        // A próxima leitura é de novo um método 'token-based'
        segundaParteNome = teclado.next(); // Lê "Silva" do buffer

        System.out.println("Segunda parte lida: " + segundaParteNome); // Saída: "Silva"


        teclado.close();

    }

}