import java.util.Scanner;

public class BEE1174{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        double A[] = new double[100];

        for(int posicao = 0; posicao < A.length; posicao++){

            A[posicao] = keyboard.nextDouble();

        }

        for(int posicao = 0; posicao < A.length; posicao++){

            if(A[posicao] <= 10.0){

                System.out.printf("A[%d] = %.1f\n", posicao, A[posicao]);
                
            }
            

        }

        keyboard.close();

    }

}