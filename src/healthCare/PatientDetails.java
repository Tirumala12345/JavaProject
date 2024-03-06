package healthCare;

public class PatientDetails {
    private String patientName;
    private int mobileNo;
    private int age;
    private String gender;
    private int consultationFee;
    private String disease;

    public PatientDetails(String patientName, int mobileNo, int age, String gender, int consultationFee, String disease) {
        this.patientName = patientName;
        this.mobileNo = mobileNo;
        this.age = age;
        this.gender = gender;
        this.consultationFee = consultationFee;
        this.disease = disease;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public String getDisease() {
        return disease;
    }
}
