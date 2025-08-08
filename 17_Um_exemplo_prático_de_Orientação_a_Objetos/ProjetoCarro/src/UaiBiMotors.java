public class UaiBiMotors {

    public static void main(String[] args) {

        Carro c1, c2;

        c1 = new Carro();
        c2 = new Carro();

        c1.marca = "Toyota";
        c1.modelo = "Fielder";
        c1.cor = "Prata";
        c1.ano = 2005;
        c1.km = 112000;
        c1.preco = 35.789;

        c2.marca = "Toyota";
        c2.modelo = "Corolla";
        c2.cor = "Prata";
        c2.ano = 2024;
        c2.km = 0;
        c2.preco = 135.123;

        c1.exibirAnuncio();
        c1.calcularSeguro(1);
        double ipvaC1 = c1.calcularIPVA();

        if(ipvaC1 == 0){
            System.out.println("Veiculo isento de imposto");
        }
        else{
            System.out.printf("IPVA do carro: R$ %.3f%n", ipvaC1);
        }

        c2.exibirAnuncio();
        c2.calcularSeguro(3);
        double ipvaC2 = c2.calcularIPVA();

        if(ipvaC2 == 0){
            System.out.println("Veiculo isento de imposto");
        }
        else{
            System.out.printf("IPVA do carro: R$ %.3f%n", ipvaC2);
        }

    }

}
