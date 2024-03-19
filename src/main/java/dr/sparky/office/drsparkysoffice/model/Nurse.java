package dr.sparky.office.drsparkysoffice.model;

public class Nurse {
    private String administerMedication;
    private String patientHealth;

    public String getAdministerMedication() {
        return administerMedication;
    }

    public void setAdministerMedication(String administerMedication) {
        this.administerMedication = administerMedication;
    }

    public String getPatientHealth() {
        return patientHealth;
    }

    public void setPatientHealth(String patientHealth) {
        this.patientHealth = patientHealth;
    }

    public String updateRecord(Record addRecord) {
        // Implementation will depend on what updating a record entails
        // This method might not be returning the correct type based on the UML provided
        return "Update successful"; // Placeholder for compilation
    }
}

