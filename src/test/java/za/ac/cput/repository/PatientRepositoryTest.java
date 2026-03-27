package za.ac.cput.repository;
/*
 * Sesona Ntshatsha
 * 240773365

 */


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Patient;
import za.ac.cput.repository.patient.impl.PatientRepository;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PatientRepositoryTest {

    private PatientRepository repo = PatientRepository.getRepository();

    private Patient patient = new Patient.Builder()
            .setPatientID("P001")   // builder stays like this
            .setFirstName("Sesona")
            .setLastName("Silva")
            .setAge(25)
            .setEmail("Sese15@gmail.com")
            .setGender("Female")
            .setAddress("28292 UMongikazi Street,Mfuleni,Bardale,7100")
            .build();

    @Test
    void create() {
        Patient created = repo.create(patient);
        assertNotNull(created);
        assertEquals(patient.getPatientID(), created.getPatientID());
    }

    @Test
    void read() {
        repo.create(patient);
        Patient read = repo.read(patient.getPatientID());
        assertNotNull(read);
    }

    @Test
    void update() {
        repo.create(patient);

        Patient updatedPatient = new Patient.Builder()
                .setPatientID("P001")
                .setFirstName("Updated Name") // <-- change something
                .setLastName("Silva")
                .setEmail("Sese15@gmail.com")
                .setAge(25)
                .setGender("Female")
                .setAddress("28292 UMongikazi Street,Mfuleni,Bardale,7100")
                .build();

        Patient updated = repo.update(updatedPatient);
        assertNotNull(updated);

        assertEquals("Updated Name", updated.getFirstName()); // match what you changed
    }
    @Test
    void delete() {
        repo.create(patient);
        boolean success = repo.delete(patient.getPatientID());
        assertTrue(success);
    }

    @Test
    void getAll() {
        repo.create(patient);
        Set<Patient> patients = repo.getAll();
        assertFalse(patients.isEmpty());
    }
}