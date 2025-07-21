import java.util.Scanner;

public class testeForEach{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int vetor[] = new int[10];

        for(int i = 0; i < vetor.length; i++){

            System.out.println("Digite um numero inteiro: ");
            vetor[i] = keyboard.nextInt();

        }

        for(int elemento: vetor){
            System.out.println("Elemento do vetor: " + elemento);
        } 

        keyboard.close();

    }

}