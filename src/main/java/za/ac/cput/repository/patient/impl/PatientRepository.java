package za.ac.cput.repository.patient.impl;
/*
 * Sesona Ntshatsha
 * 240773365

 */
import za.ac.cput.domain.Patient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PatientRepository implements IPatientRepository {

    private static PatientRepository repository = null;
    private Map<String, Patient> patientDB;

    private PatientRepository() {
        patientDB = new HashMap<>();
    }

    public static PatientRepository getRepository() {
        if (repository == null) {
            repository = new PatientRepository();
        }
        return repository;
    }

    @Override
    public Patient create(Patient patient) {
        patientDB.put(patient.getPatientID(), patient);
        return patientDB.get(patient.getPatientID());
    }

    @Override
    public Patient read(String id) {
        return patientDB.get(id);
    }

    @Override
    public Patient update(Patient patient) {
        if (patientDB.containsKey(patient.getPatientID())) {
            patientDB.put(patient.getPatientID(), patient);
            return patient;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        return patientDB.remove(id) != null;
    }

    @Override
    public Set<Patient> getAll() {
        return new HashSet<>(patientDB.values());
    }
}


