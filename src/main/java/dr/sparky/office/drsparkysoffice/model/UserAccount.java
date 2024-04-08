package dr.sparky.office.drsparkysoffice.model;

public class UserAccount {

    private String email;
    private String password;
    private UserType type;
    private Patient patient;

    // Constructor for doctor and nurse
    public UserAccount(String email, String password, UserType type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    // Constructor for patient
    public UserAccount(String email, String password, UserType type, Patient patient) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.patient = patient;
    }

    public boolean isPatient(){
        return  patient != null;
    }

    public boolean isNurse(){
        return  type.equals(UserType.NURSE);
    }

    public boolean isDoctor(){
        return  type.equals(UserType.DOCTOR);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", patient=" + patient +
                '}';
    }
}
