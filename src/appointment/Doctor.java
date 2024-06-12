package appointment;

public class Doctor extends Person {
    private String specialty;
    private String description;

    public Doctor(String id, String name, String specialty, String description) {
        super(id, name);
        this.specialty = specialty;
        this.description = description;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor ID: " + getId());
        System.out.println("Doctor Name: " + getName());
        System.out.println("Specialty: " + specialty);
        System.out.println("Description: " + description);
    }

    public void prescribeMedicine(String medicine) {
        System.out.println("Prescribing medicine: " + medicine);
    }

    public void prescribeMedicine(String medicine, String dosage) {
        System.out.println("Prescribing medicine: " + medicine + " with dosage: " + dosage);
    }
}
