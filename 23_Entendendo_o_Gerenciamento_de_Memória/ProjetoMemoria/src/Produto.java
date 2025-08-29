// Classe que representa um produto com id, nome e preço.
public class Produto {

    // Atributos do produto (privados para manter encapsulamento).
    private int id;
    private String nome;
    private double preco;

    // Construtor: usado para criar um novo objeto e inicializar seus atributos.
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Mét.odo getters e setters: permitem acessar e modificar atributos.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Mét.odo auxiliar para exibir as informações do produto em formato de string.
    public String exibirInfo(){
        return id + " | " + nome + " | " + preco;
    }

}
