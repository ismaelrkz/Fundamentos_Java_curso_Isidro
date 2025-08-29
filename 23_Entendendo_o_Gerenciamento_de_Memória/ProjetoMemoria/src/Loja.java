public class Loja {
    public static void main(String[] args) {

        // Criamos duas referências (p1 e p2) do tipo precoProduto.
        // Aqui ainda não existem objetos na memória heap, apenas variáveis de referência.
        Produto p1, p2;

        // Agora instanciamos um novo objeto precoProduto.
        // A JVM aloca memória na "heap" e p1 passa a apontar para esse espaço.
        p1 = new Produto(
                1,
                "Computador",
                1000.00);

        /*
        // Exibindo os dados do objeto p1.
        System.out.println("p1 = " + p1.exibirInfo());

        // Se fizermos isso:
        // p2 = p1;
        // Não será criada uma cópia. p2 e p1 vão apontar para o MESMO objeto.
        // Logo, alterar p2 refletirá em p1.

        // Para criar um novo objeto com os mesmos dados de p1:
        p2 = new precoProduto(
                p1.getId(),
                p1.getNome(),
                p1.getPreco());

        // Alterando o preço de p2.
        p2.setPreco(1500);

        // Agora, p1 e p2 possuem áreas de memória diferentes.
        // Alterar p2 não afeta p1.
        System.out.println("p2 = " + p2.exibirInfo());
        System.out.println("p1 = " + p1.exibirInfo());
        */

        // Mostrando informações iniciais de p1.
        System.out.println("p1 = " + p1.exibirInfo());

        // Atualização de preço usando a classe Atualizador.
        System.out.println("Antes da correção de preço...");
        System.out.println("p1 = " + p1.exibirInfo());

        // Criamos um objeto Atualizador, passando o índice de aumento (7,5%).
        Atualizador a = new Atualizador(7.5);

        // Passamos o objeto p1 como parâmetro.
        // O mét.odo atualizarPreco vai modificar diretamente o objeto original.
        a.atualizarPreco(p1);

        // Após a atualização, o objeto p1 foi alterado, pois foi passado por referência.
        System.out.println("Após correção de preço");
        System.out.println("p1 = " + p1.exibirInfo());

    }
}
