public class LojaGC {
    public static void main(String[] args) {

        Produto p1;

        for(int i = 0; i < 100; i++){

            p1 = new Produto(i, "Produto" + i, i*10);


        }
        System.gc();

    }
}
