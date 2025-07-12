import java.util.Scanner;

public class testeWhile{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor, resultado, contador;

        System.out.println("Digite um valor:");

        valor = teclado.nextInt();

        contador = 1;

        while(contador <= 10){

            resultado = valor * contador;

            System.out.println(valor + " x " +  contador + " = " + resultado);

            contador = contador + 1;

        }

        teclado.close();

    }

}