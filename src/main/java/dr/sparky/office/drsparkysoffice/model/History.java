package dr.sparky.office.drsparkysoffice.model;

import java.util.List;

public class History {

    private List<Record> patientRecord;

    public List<Record> getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(List<Record> patientRecord) {
        this.patientRecord = patientRecord;
    }

    public Record retrieveRecord(int patientID) {
        // Implementation will depend on the logic to retrieve a record based on patientID
        return null;
    }

    public void addRecord(Record record) {
        patientRecord.add(record);
    }

    public List<History> getAllRecords() {
        return null;
    }
}

