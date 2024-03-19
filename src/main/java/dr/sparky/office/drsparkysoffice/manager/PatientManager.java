package dr.sparky.office.drsparkysoffice.manager;

import dr.sparky.office.drsparkysoffice.model.Patient;

import java.util.List;

/**
 * Manages patient data within the application.
 */
public class PatientManager {
    /** List of all patients */
    private List<Patient> allPatients;

    /**
     * Constructs a PatientManager with the specified list of patients.
     *
     * @param allPatients List of all patients
     */
    public PatientManager(List<Patient> allPatients) {
        this.allPatients = allPatients;
    }

    /**
     * Adds a new patient to the list of all patients.
     *
     * @param patient The patient to add
     */
    public void addPatient(Patient patient) {
        this.allPatients.add(patient);
    }

    /**
     * Retrieves a patient based on their ID.
     *
     * @param patientID The ID of the patient to retrieve
     * @return The patient object if found, or null if not found
     */
    public Patient retrievePatient(int patientID) {
        return allPatients.stream()
                .filter(p -> p.getPatientID() == patientID)
                .findFirst()
                .orElse(null);
    }

    /**
     * Gets the list of all patients.
     *
     * @return The list of all patients
     */
    public List<Patient> getAllPatients() {
        return allPatients;
    }

    /**
     * Sets the list of all patients.
     *
     * @param allPatients The list of all patients
     */
    public void setAllPatients(List<Patient> allPatients) {
        this.allPatients = allPatients;
    }
}
