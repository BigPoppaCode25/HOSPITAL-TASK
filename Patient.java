public class Patient 
private String name
  private int age
  private PatientCategory categroy 

  public Patient(String name , int age, PatientCategory category) {
  this.name = name;
  this.age = age;
  this.category = category;
}

public String getName() { return name; }
public int getAfe() { return age; }
public PatientCategory getCategory() { return category; }
