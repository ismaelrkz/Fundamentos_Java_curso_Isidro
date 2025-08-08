public class SistemaUsuario {
    public static void main(String[] args) {

        Usuario u1;

        u1 = new Usuario();

        u1.setFirstName("Ismael");
        u1.setSecondName("Reckziegel");
        u1.setEmail("ismael@email.com");
        u1.setBirthYear(1992);
        u1.setSocialSecurityNumber(1234567890);

        u1.showUser();

    }
}
