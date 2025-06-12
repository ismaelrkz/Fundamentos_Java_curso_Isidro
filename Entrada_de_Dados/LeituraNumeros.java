import java.util.Scanner;

    public class LeituraNumeros {
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a;
        float b;
        double c;

        System.out.println("Por favor digite um número inteiro!");
        a = teclado.nextInt();
        System.out.println("Você digitou o seguinte valor: " + a);

        System.out.println("Por favor digite um número float!");
        b = teclado.nextFloat();
        System.out.println("Você digitou o seguinte valor: " + b);

        System.out.println("Por favor digite um número double!");
        c = teclado.nextDouble();
        System.out.printf("Você digitou o seguinte valor: %.3f\n", c);

        teclado.close();

    }

}