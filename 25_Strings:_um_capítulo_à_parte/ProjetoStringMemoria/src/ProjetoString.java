public class ProjetoString {
    public static void main(String[] args) {

        // ---------------- Exemplo 1 ----------------
        // Aqui estamos utilizando literais de String.
        // Quando usamos aspas diretas (sem new), as Strings são armazenadas no "String Pool".
        // Se já existir no pool, a JVM reutiliza a mesma referência.
        // Assim, s1 e s2 apontam para o mesmo objeto em memória.
        String s1a, s2a;

        s1a = "Hello world!";
        s2a = "Hello world!";

        if (s1a == s2a) {
            System.out.println("Exemplo 1: Iguais (mesma referência no String Pool)");
        } else {
            System.out.println("Exemplo 1: Diferentes");
        }

        System.out.println("------ // ------");

        // ---------------- Exemplo 2 ----------------
        // Agora criamos Strings usando o operador "new".
        // Neste caso, cada chamada de "new String()" cria um novo objeto na heap,
        // mesmo que o conteúdo seja o mesmo.
        // Portanto, s1b e s2b NÃO apontam para a mesma área de memória.
        String s1b, s2b;

        s1b = new String("Hello world!");
        s2b = new String("Hello world!");

        if (s1b == s2b) {
            System.out.println("Exemplo 2: Apontam para a mesma área de memória");
        } else {
            System.out.println("Exemplo 2: Apontam para áreas de memória diferentes");
        }

        // Para comparar os conteúdos de fato, usamos o mét.odo equals().
        if (s1b.equals(s2b)) {
            System.out.println("Exemplo 2: Conteúdo igual");
        } else {
            System.out.println("Exemplo 2: Conteúdo diferente");
        }

        System.out.println("------ // ------");

        // ---------------- Exemplo 3 ----------------
        // Neste exemplo, mostramos a imutabilidade das Strings.
        // Quando atribuimos s2c = s1c, ambas apontam para o mesmo objeto inicialmente.
        // Porém, quando mudamos o valor de s2c, a JVM cria um NOVO objeto em memória,
        // e s1c continua a apontar para o objeto original.
        String s1c, s2c;

        s1c = "Hello world!";
        s2c = s1c;

        System.out.println("Exemplo 3: Conteúdo inicial");
        System.out.println("s1c: " + s1c);
        System.out.println("s2c: " + s2c);

        System.out.println("------ // ------");

        // Agora, mudamos o valor de s2c.
        s2c = "Good bye world!";

        // Note que s1c continua inalterada, pois Strings são imutáveis.
        System.out.println("Exemplo 3: Após modificar s2c");
        System.out.println("s1c: " + s1c);
        System.out.println("s2c: " + s2c);
    }
}
