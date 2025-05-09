import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


// Main class to load and display patient appointments from a file using BST.

public class Main {
    public static void main(String[] args) {
        AppointmentBST bst = new AppointmentBST();

        // Read appointments from file and insert into BST
        try (BufferedReader br = new BufferedReader(new FileReader("appointments.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String time = parts[2];

                // Add appointment to BST
                bst.addAppointment(new PatientAppointment(id, name, time));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Display appointments in order
        System.out.println("Appointments in order:");
        bst.inOrderTraversal(bst.getRoot());
    }
}
