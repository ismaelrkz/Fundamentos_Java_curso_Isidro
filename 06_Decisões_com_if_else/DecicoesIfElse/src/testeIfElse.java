import java.util.Scanner;

public class testeIfElse{

    public static void main(String args[]){

        double notaUm, notaDois, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        notaUm = teclado.nextDouble();

        System.out.println("Digite a nota 2:");
        notaDois = teclado.nextDouble();

        media = (notaUm + notaDois) / 2;

        System.out.println("A sua média é: " + media);

        if( media >= 5.0 && media >= 6.0 ){
            System.out.println("Parabéns, você foi aprovado!");
        }else{
            System.out.println("Puxa vida! Você foi reprovado!");
        }

        teclado.close();

    }

}