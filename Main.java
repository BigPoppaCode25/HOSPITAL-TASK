public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital. addPatient(new Patient( name "John", age 25 PatientCategory. GENERAL));
        hospital.addPatient(new Patient(name "Sarah", age 70, PatientCategory. ELDERLY));
        hospital. addPatient(new Patient(name "Baby Joe", age 2 PatientCategory,PEDIATRIC));
        hospital.displayPatient();
    }
}
        
