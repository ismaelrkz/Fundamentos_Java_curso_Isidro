import java.util.Scanner;

public class testeVetor{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        double notas[];
        notas = new double[5];

        for(int posicao = 0; posicao < 5; posicao++){

            System.out.println("Digite a nota do aluno: " + posicao);

            notas[posicao] = keyboard.nextDouble();

        }

        for(int posicao = 0; posicao < 5; posicao++){

            System.out.printf("Nota do aluno %d = %.1f\n", posicao, notas[posicao]);

        }

        keyboard.close();

    }

}