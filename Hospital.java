import


public class Hospital { 
    private List<Patient> patients

  public Hospital() { patients = new ArrayList<>(); }



public void addPatient(Patient patient) { patients. add(patient); }



public List<Patient() { return patients; }



public void displayPatients() {
  for (Patient p : patients) {
    System.out.println(p.getName() +"-" + p.getCategory());
  }
}
}
