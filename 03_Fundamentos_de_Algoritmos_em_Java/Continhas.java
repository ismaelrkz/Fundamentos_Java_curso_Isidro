public class Continhas {

    public static void main(String args[]) {

        // Declaração de variáveis
        int a, b, c;      // variáveis inteiras
        float d;          // variável ponto flutuante (precisão simples - 32 bits)
        double e;         // variável ponto flutuante (precisão dupla - 64 bits)

        // Operações com inteiros
        a = 27;
        b = 4;

        c = a + b; // soma
        System.out.println("O valor de C é: " + c);

        c = a - b; // subtração
        System.out.println("O valor de C é: " + c);

        c = a * b; // multiplicação
        System.out.println("O valor de C é: " + c);

        c = a / b; // divisão inteira: 27 / 4 = 6
        System.out.println("O valor de C é: " + c);

        c = a % b; // resto da divisão (módulo): 27 % 4 = 3
        System.out.println("O valor de C é: " + c);

        // Trabalhando com float
        d = 1.0f; // usar o sufixo 'f' para indicar que o literal 1.0 é do tipo float (32 bits);
                  // sem o 'f', o compilador assume que é do tipo double (64 bits), o que causaria erro de compilação ao atribuir a um float.

        System.out.println("O valor de C é: " + d);

        d = 1 / 2; // os valores 1 e 2 são inteiros, então a divisão é feita como divisão inteira: 1 / 2 = 0;
                   // o resultado inteiro 0 é então convertido para float: 0.0
        System.out.println("O valor de C é: " + d);

        d = 1.0f / 2; // agora 1.0f é um float, então a operação é feita como ponto flutuante: 1.0 / 2 = 0.5
        System.out.println("O valor de C é: " + d);

        System.out.printf("O valor de C é: %f\n", d); 
        // printf permite formatar a saída; %f é usado para ponto flutuante com 6 casas decimais por padrão.
        // Saída esperada: O valor de C é: 0.500000

        // Exemplo com double, para comparar precisão
        e = 1.0 / 3.0; // operação feita com double
        System.out.println("O valor de E é: " + e); // Saída com mais casas decimais

        System.out.printf("O valor de E formatado: %.10f\n", e); 
        // imprime E com 10 casas decimais para mostrar a maior precisão do tipo double
    }

}
