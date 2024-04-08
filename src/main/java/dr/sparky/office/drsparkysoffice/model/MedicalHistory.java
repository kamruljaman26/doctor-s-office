package dr.sparky.office.drsparkysoffice.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MedicalHistory implements Serializable {

    private int patientId;
    private LocalDateTime date;
    private String allergies;
    private String medication;
    private String pharmacy;
    private String prescription;
    private Vitals vitals;
    private boolean isVisitCompleted;

    public MedicalHistory(int patientId, Vitals vitals) {
        this.patientId = patientId;
        this.vitals = vitals;
        date = LocalDateTime.now(); // init current date
    }

    public boolean isVisitCompleted() {
        return isVisitCompleted;
    }

    public void setVisitCompleted(boolean visitCompleted) {
        isVisitCompleted = visitCompleted;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Vitals getVitals() {
        return vitals;
    }

    public void setVitals(Vitals vitals) {
        this.vitals = vitals;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "History{" +
                "date=" + date +
                ", allergies='" + allergies + '\'' +
                ", medication='" + medication + '\'' +
                ", pharmacy='" + pharmacy + '\'' +
                ", prescription='" + prescription + '\'' +
                ", vitals=" + vitals +
                '}';
    }
}
