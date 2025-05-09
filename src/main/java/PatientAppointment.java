
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a patient's appointment details.
 */
public class PatientAppointment {
    private int id;
    private String name;
    private LocalTime time;

    // Constructor accepts time as a string like "09:00"
    public PatientAppointment(int id, String name, String timeString) {
        this.id = id;
        this.name = name;
        this.time = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm"));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // This is the method BST code is trying to call
    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return time + " - " + name;
    }
}
