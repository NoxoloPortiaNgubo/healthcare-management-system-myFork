package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Patient;
/*
* Sesona Ntshatsha
* 240773365

 */

import static org.junit.jupiter.api.Assertions.*;

    class PatientFactoryTest {

        @Test
         void createPatient() {
            Patient patient = PatientFactory.createPatient(
                    "P001",
                    "Sesona",
                    "Silva",
                    "Sese15@gmail.com",
                    25,
                    "Female",
                    "28292 UMongikazi Street,Mfuleni,Bardale,7100"

            );

            assertNotNull(patient);
            assertEquals("P001", patient.getPatientID());
        }

        @Test
        void createPatientFail() {
            Patient patient = PatientFactory.createPatient(
                    "",   // invalid ID
                    "Sesona",
                    "Silva",
                    "Sese15@gmail.com",
                    25,
                    "Female",
                     "28292 UMongikazi Street,Mfuleni,Bardale,7100"
            );

            assertNull(patient);
        }
    }


