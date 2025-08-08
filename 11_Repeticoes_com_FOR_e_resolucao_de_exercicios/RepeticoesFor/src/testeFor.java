import java.util.Scanner;

public class testeFor{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor, resultado;

        System.out.println("Digite um valor:");

        valor = teclado.nextInt();

        for(int contador = 1; contador <= 10; contador = contador + 1){

            if(contador == 5){
                // break;
                continue;
            }

            resultado = valor * contador;

            System.out.println(valor + " x " +  contador + " = " + resultado);
            
        }

        teclado.close();

    }

}