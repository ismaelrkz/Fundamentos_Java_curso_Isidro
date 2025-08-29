// Classe responsável por atualizar o preço de um produto.
public class Atualizador {

    // Atributo que armazena o índice percentual de atualização (ex: 7,5%).
    private double indice;

    // Construtor: inicializa o índice no momento da criação do objeto.
    public Atualizador(double indice) {
        this.indice = indice;
    }

    // Getter e Setter para acessar e alterar o índice.
    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    // Mét.odo que recebe um objeto precoProduto e atualiza o seu valor.
    // IMPORTANTE: o objeto passado como parâmetro é alterado diretamente,
    // pois objetos em Java são passados por referência.
    public void atualizarPreco(Produto p){
        // Calcula o novo preço aplicando o índice percentual.
        double novoPreco = p.getPreco() + (p.getPreco() * indice / 100);

        // Atualiza o preço no objeto original.
        p.setPreco(novoPreco);
    }

}
