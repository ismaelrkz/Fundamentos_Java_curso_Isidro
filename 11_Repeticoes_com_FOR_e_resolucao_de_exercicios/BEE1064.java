import java.util.Scanner;

public class BEE1064{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double valor, media=0;
        int numPositivo = 0;

        System.out.println("Digite um valor:");

        for(int contador = 1; contador <=6; contador++){

            valor = teclado.nextDouble();

            if(valor > 0){
                media = media + valor;
                numPositivo++; //
            }

        }

        System.out.println(numPositivo + " valores positivos");
        System.out.printf("%.1f\n", (media/numPositivo));

        teclado.close();

    }

}