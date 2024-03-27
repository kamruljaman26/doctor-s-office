package dr.sparky.office.drsparkysoffice.model;

public class Patient {

    private int patientID;
    private String name;
    private String contactInfo;
    private String medicalHistory;

    // Constructor
    public Patient(int patientID, String name, String contactInfo, String medicalHistory) {
        this.patientID = patientID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.medicalHistory = medicalHistory;
    }

    // Getters and setters
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Method to update profile
    public void updateProfile(String name, String contactInfo, String medicalHistory) {
        setName(name);
        setContactInfo(contactInfo);
        setMedicalHistory(medicalHistory);
    }
}
