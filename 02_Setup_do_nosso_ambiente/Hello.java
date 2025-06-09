// public: modificador de acesso que permite que a classe seja acessada por qualquer outra classe
// class: palavra-chave que define uma classe em Java
// Hello: nome da classe (por convenção, nomes de classes começam com letra maiúscula)
public class Hello {

    // public: permite que o método seja acessado de qualquer lugar
    // static: o método pertence à classe, e não a uma instância
    // void: o método não retorna nenhum valor
    // main: ponto de entrada do programa Java
    // String args[]: parâmetro que recebe argumentos da linha de comando
    public static void main(String args[]){
        
        // System: classe que representa o sistema
        // out: campo estático da classe System que representa a saída padrão (normalmente o console)
        // print: método que imprime texto no console, sem pular linha ao final
        // "Ola mundo! Meu primeiro programa Java!": string que será impressa
        System.out.print("Ola mundo! Meu primeiro programa Java!");

    }

}