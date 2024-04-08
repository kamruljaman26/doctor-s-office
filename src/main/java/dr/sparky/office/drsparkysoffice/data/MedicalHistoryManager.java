package dr.sparky.office.drsparkysoffice.data;

import dr.sparky.office.drsparkysoffice.model.MedicalHistory;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedicalHistoryManager {

    private static final String MEDICAL_HISTORY_FILE = "database/medicalHistory.bin";
    private Map<Integer, List<MedicalHistory>> medicalHistories;

    public MedicalHistoryManager() {
        loadMedicalHistories();
    }

    private void loadMedicalHistories() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MEDICAL_HISTORY_FILE))) {
            medicalHistories = (Map<Integer, List<MedicalHistory>>) ois.readObject();
        } catch (FileNotFoundException e) {
            medicalHistories = new HashMap<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Failed to load medical histories", e);
        }
    }

    public void saveMedicalHistories() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(MEDICAL_HISTORY_FILE))) {
            oos.writeObject(medicalHistories);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save medical histories", e);
        }
    }

    public void addMedicalHistory(int patientId, MedicalHistory history) {
        List<MedicalHistory> patientHistories = medicalHistories.getOrDefault(patientId, new ArrayList<>());
        patientHistories.add(history);
        medicalHistories.put(patientId, patientHistories);
        saveMedicalHistories();
    }

    public List<MedicalHistory> getMedicalHistories(int patientId) {
        return medicalHistories.getOrDefault(patientId, new ArrayList<>());
    }

    public boolean updateMedicalHistory(int patientId, MedicalHistory updatedHistory) {
        if (!medicalHistories.containsKey(patientId)) {
            return false; // No medical histories for this patient
        }

        List<MedicalHistory> patientHistories = medicalHistories.get(patientId);
        // Assuming MedicalHistory has an id or a similar unique identifier
        patientHistories.replaceAll(h -> h.getPatientId() == updatedHistory.getPatientId() ? updatedHistory : h);
        saveMedicalHistories();
        return true;
    }

    public boolean deleteMedicalHistory(int patientId, int historyId) {
        if (!medicalHistories.containsKey(patientId)) {
            return false; // No medical histories for this patient
        }

        List<MedicalHistory> patientHistories = medicalHistories.get(patientId);
        patientHistories.removeIf(h -> h.getPatientId() == historyId); // Assuming MedicalHistory has an id
        if (patientHistories.isEmpty()) {
            medicalHistories.remove(patientId);
        }
        saveMedicalHistories();
        return true;
    }
}
