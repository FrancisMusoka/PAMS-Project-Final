import org.junit.Test;
import static org.junit.Assert.*;


// Unit test for AppointmentBST.

public class AppointmentBSTTest {

    @Test
    public void testAddSingleAppointment() {
        // Create an empty BST
        AppointmentBST bst = new AppointmentBST();

        // Create a patient appointment and add it
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient", "09:00");
        bst.addAppointment(p1);

        // Ensure the root node is not null after insertion
        assertNotNull("The root should not be null after adding an appointment.", bst.getRoot());
    }
}
