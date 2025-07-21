public class testeArgs{

    public static void main(String args[]){

        System.out.println("Numero de elementos passados na linha de comando:");
        System.out.println(args.length);

        for(int posicao = 0; posicao < args.length; posicao++){
            System.out.println("Posição: " + args[posicao]);
        }

    }

}