package appointment;

import java.util.Date;

public class MedicalTest {
    private String testId;
    private String patientId;
    private String doctorId;
    private String testName;
    private Date testDate;
    private String results;

    // Association: MedicalTest is associated with patient and doctor
    public MedicalTest(String testId, String patientId, String doctorId, String testName, Date testDate, String results) {
        this.testId = testId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.testName = testName;
        this.testDate = testDate;
        this.results = results;
    }

    // Getters and Setters
    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
