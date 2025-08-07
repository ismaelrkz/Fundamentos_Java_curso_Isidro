public class SistemaUsuarioConstrutor {

    public static void main(String[] args) {

        UsuarioConstrutor u1, u2;

        u1 = new UsuarioConstrutor(
                "Valesca",
                "Bouvier",
                1996,
                1234567890,
                "valesca@email.com"
        );

        u1.showUser();

        System.out.println();

        u2 = new UsuarioConstrutor(
                "Nathan",
                "Reckziegel",
                2023,
                0123,
                "nathan@email.com"
        );

        u2.showUser();

    }
}
