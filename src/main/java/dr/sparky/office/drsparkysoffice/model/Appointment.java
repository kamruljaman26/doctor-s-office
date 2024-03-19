package dr.sparky.office.drsparkysoffice.model;

import java.time.LocalDateTime;

public class Appointment {

    private int appointmentID;
    private LocalDateTime appointmentTime;
    private Patient patient;

    public Appointment(int appointmentID, LocalDateTime appointmentTime, Patient patient) {
        this.appointmentID = appointmentID;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
    }

    // Getters and setters
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

