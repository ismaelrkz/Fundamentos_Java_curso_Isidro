public class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;
    int km;
    double preco;

    void exibirAnuncio(){
        System.out.println("Anuncio do carro:");
        System.out.println(marca + " - " + modelo + " (" + ano + ")");
        System.out.println("Cor: " + cor + " - KM: " + km + " - R$ " + preco);

    }

    void calcularSeguro(int perfil){

        switch(perfil){
            case 1:
                System.out.println("Seguro para idoso - 8.0%");
                System.out.printf("R$ %.3f\n", (preco * 0.08));
                break;
            case 2:
                System.out.println("Seguro para adulto - 6.0%");
                System.out.printf("R$ %.3f\n", (preco * 0.06));
                break;
            case 3:
                System.out.println("Seguro para jovem - 10.0%");
                System.out.printf("R$ %.3f\n", (preco * 0.10));
                break;
            default:
                System.out.println("Não temos esse perfil");
        }

    }

    double calcularIPVA(){

        double valorIpva;

        if(ano <= 2005){
            valorIpva = 0;
        }
        else{
            valorIpva = preco * 0.035;
        }

        return valorIpva;

    }

}
