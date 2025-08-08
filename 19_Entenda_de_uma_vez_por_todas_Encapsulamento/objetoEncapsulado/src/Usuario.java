public class Usuario {

    private String firstName;
    private String secondName;
    private int birthYear;
    private int socialSecurityNumber;
    private String email;

    public void showUser(){
        System.out.println("Usuário: " + firstName + " " + secondName);
        System.out.println("CPF: " + socialSecurityNumber);
        System.out.println("Data de nascimento: " + birthYear);
        System.out.println("E-mail: " + email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
