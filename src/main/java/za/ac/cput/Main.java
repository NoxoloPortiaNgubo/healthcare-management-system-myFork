package za.ac.cput;
import za.ac.cput.domain.Patient;

/*
 * Sesona Ntshatsha
 * 240773365

 */
public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient.Builder()
                .setPatientID("P001")
                .setFirstName("Sesona")
                .setLastName("Silva")
                .setEmail("Sese15@gmail.com")
                .setAge(25)
                .setGender("Female")
                .setAddress("28292 UMongikazi Street,Mfuleni,Bardale,7100")
                .build();

        }
    }
