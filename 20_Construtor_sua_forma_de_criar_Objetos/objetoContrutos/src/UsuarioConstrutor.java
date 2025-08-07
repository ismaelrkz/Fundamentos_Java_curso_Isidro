public class UsuarioConstrutor {

    private String firstName;
    private String secondName;
    private int birthYear;
    private int socialSecurityNumber;
    private String email;

    public UsuarioConstrutor(String firstName, String secondName, int birthYear, int socialSecurityNumber, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.socialSecurityNumber = socialSecurityNumber;
        this.email = email;
    }

    public void showUser(){
        System.out.println("Usuário: " + firstName + " " + secondName);
        System.out.println("CPF: " + socialSecurityNumber);
        System.out.println("Data de nascimento: " + birthYear);
        System.out.println("E-mail: " + email);
    }

}
