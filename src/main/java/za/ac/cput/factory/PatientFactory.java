package za.ac.cput.factory;
/*
 * Sesona Ntshatsha
 * 240773365

 */

import za.ac.cput.domain.Patient;

public class PatientFactory {

    public static Patient createPatient(String patientID, String firstName, String lastName,
                                        String email, int age, String gender, String address) {
        if (patientID == null || patientID.isEmpty())
            return null;

        if  (firstName == null )
            return null;

        if (lastName == null)
            return null;
        if  (age <= 0)
            return null;
        if  (gender == null)
            return null;

        return new Patient.Builder()
                .setPatientID(patientID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAge(age)
                .setGender(gender)
                .setAddress(address)
                .build();
    }
}