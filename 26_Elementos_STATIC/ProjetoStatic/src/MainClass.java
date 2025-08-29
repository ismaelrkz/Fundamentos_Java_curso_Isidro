public class MainClass {
    public static void main(String[] args) {

        // Chamada de um mét.odo estático (não precisa criar objeto da classe Utilidades)
        System.out.println("Resultado (método soma) = " + Utilidades.soma(3, 3));

        // Acessando uma variável estática mutável (compartilhada pela classe)
        System.out.println("Valor (Variável valorMutavel) = " + Utilidades.valorMutavel);

        // Alterando o valor da variável estática mutável
        Utilidades.valorMutavel = 20;

        // Exibindo o novo valor (todos que acessarem essa variável verão o valor 20)
        System.out.println("Novo valor (Variável valorMutavel) = " + Utilidades.valorMutavel);

        // Acessando uma constante estática (final → não pode ser alterada)
        System.out.println("Valor (Variável valorImutavel) = " + Utilidades.valorImutavel);

        // Exemplo de constante já existente em Java (definida na classe Math)
        System.out.println("Valor de PI = " + Math.PI);

    }
}
