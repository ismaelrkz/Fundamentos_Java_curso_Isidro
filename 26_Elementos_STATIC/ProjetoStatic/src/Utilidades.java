public class Utilidades {

    // Mét.odo estático → pode ser chamado sem precisar de um objeto
    // Exemplo: Utilidades.soma(3, 3)
    public static int soma(int x, int y){
        return x + y;
    }

    // Variável estática mutável
    // Pode ser acessada e alterada em qualquer parte do sistema
    // Exemplo: Utilidades.valorMutavel
    public static int valorMutavel = 10;

    // Variável estática imutável (constante)
    // O uso de 'final' impede que o valor seja alterado após definido
    // Exemplo: Utilidades.valorImutavel
    public static final int valorImutavel = 10;

}
