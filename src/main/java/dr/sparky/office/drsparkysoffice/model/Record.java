package dr.sparky.office.drsparkysoffice.model;

import javafx.scene.image.Image;

import java.util.List;

public class Record {

    private int scanID;
    private int patientID;
    private String scanData;
    private List<Image> scanImages;

    // Constructor
    public Record(int scanID, int patientID, String scanData, List<Image> scanImages) {
        this.scanID = scanID;
        this.patientID = patientID;
        this.scanData = scanData;
        this.scanImages = scanImages;
    }

    // Getters and setters
    public int getScanID() {
        return scanID;
    }

    public void setScanID(int scanID) {
        this.scanID = scanID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getScanData() {
        return scanData;
    }

    public void setScanData(String scanData) {
        this.scanData = scanData;
    }

    public List<Image> getScanImages() {
        return scanImages;
    }

    public void setScanImages(List<Image> scanImages) {
        this.scanImages = scanImages;
    }
}
