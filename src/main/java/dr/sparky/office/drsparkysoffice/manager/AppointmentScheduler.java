package dr.sparky.office.drsparkysoffice.manager;

import dr.sparky.office.drsparkysoffice.model.Appointment;
import dr.sparky.office.drsparkysoffice.model.Patient;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Manages scheduling and cancellation of appointments.
 */
public class AppointmentScheduler {
    /** List of available appointment slots */
    private List<LocalDateTime> appointmentSlots;
    /** List of scheduled appointments */
    private List<Appointment> scheduledAppointments;

    /**
     * Constructs an AppointmentScheduler with empty appointment slots and scheduled appointments.
     */
    public AppointmentScheduler() {
        appointmentSlots = new ArrayList<>();
        scheduledAppointments = new ArrayList<>();
    }

    /**
     * Schedules an appointment for the given patient at the specified date and time.
     *
     * @param patientProfile The patient for whom the appointment is scheduled
     * @param dateTime       The date and time of the appointment
     * @return The ID of the scheduled appointment, or -1 if the appointment cannot be scheduled
     */
    public int scheduleAppointment(Patient patientProfile, LocalDateTime dateTime) {
        // Implementation depends on how appointment scheduling is handled
        // Logic to check availability of slot and add appointment to scheduled list
        return -1;
    }

    /**
     * Finds the index of the available slot that matches the specified date and time.
     *
     * @param dateTime The date and time to find the slot for
     * @return The index of the available slot, or -1 if no available slot is found
     */
    public int findSlot(LocalDateTime dateTime) {
        return IntStream.range(0, appointmentSlots.size())
                .filter(i -> appointmentSlots.get(i).equals(dateTime))
                .findFirst()
                .orElse(-1);
    }

    /**
     * Cancels the appointment with the given ID.
     *
     * @param appointmentID The ID of the appointment to cancel
     */
    public void cancelAppointment(int appointmentID) {
        scheduledAppointments.removeIf(appointment -> appointment.getAppointmentID() == appointmentID);
        // Optionally, add the slot back to available slots if needed
    }

    // Getters and setters for appointmentSlots and scheduledAppointments
    public List<LocalDateTime> getAppointmentSlots() {
        return appointmentSlots;
    }

    public void setAppointmentSlots(List<LocalDateTime> appointmentSlots) {
        this.appointmentSlots = appointmentSlots;
    }

    public List<Appointment> getScheduledAppointments() {
        return scheduledAppointments;
    }

    public void setScheduledAppointments(List<Appointment> scheduledAppointments) {
        this.scheduledAppointments = scheduledAppointments;
    }
}
