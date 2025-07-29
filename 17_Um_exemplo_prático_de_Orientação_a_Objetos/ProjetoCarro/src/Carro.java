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

}
