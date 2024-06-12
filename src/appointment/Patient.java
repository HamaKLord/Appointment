package appointment;

// Inheritance and Polymorphism: Patient extends Person
public class Patient extends Person {
    private String medicalHistory;

    public Patient(String id, String name, String medicalHistory) {
        super(id, name); // Call to superclass constructor
        this.medicalHistory = medicalHistory;
    }

    // Getters and Setters
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Overriding the abstract method from Person
    @Override
    public void displayInfo() {
        System.out.println("Patient ID: " + getId());
        System.out.println("Patient Name: " + getName());
        System.out.println("Medical History: " + medicalHistory);
    }
}
