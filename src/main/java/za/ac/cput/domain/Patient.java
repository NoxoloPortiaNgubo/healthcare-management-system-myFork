package za.ac.cput.domain;
/*
 * Sesona Ntshatsha
 * 240773365

 */


public class Patient {
    private  String patientID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String gender;
    private String address;

    private Patient(Builder builder) {
        this.patientID = builder.patientID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }
    public String getPatientID(){
     return patientID;
    }
    public String getFirstName() {
        return firstName;
        }
    public String getLastName() {
            return lastName;
        }
        public String getEmail() {
        return email;
        }
        public int getAge(){
            return age;
        }
        public String getGender(){
        return gender;
        }
        public String getAddress(){
        return address;
        }


    public static class Builder{
    private String patientID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String gender;
    private String address;

public Builder setPatientID(String patientID){
    this.patientID=patientID;
    return this;
}
public Builder setFirstName(String firstName){
    this.firstName=firstName;
    return this;
}
public Builder setLastName(String lastName){
    this.lastName=lastName;
    return this;
}
public Builder setEmail(String email){
    this.email=email;
    return this;

}
public Builder setAge(int age){
    this.age=age;
    return this;
}
public Builder setGender(String gender){
    this.gender=gender;
    return this;
}
public Builder setAddress(String address){
    this.address=address;
    return this;
}
public Patient build(){
    return new Patient(this);
}

    }

}
