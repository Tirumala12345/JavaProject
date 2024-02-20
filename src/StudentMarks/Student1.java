package StudentMarks;


public class Student1 {
    public String name;
    public String fatherName;
    public String mobileNo;
    public String dateOfBirth;
    public String schoolName;

    public Marks marks;
    public String result;

    public Student1(String name,String fatherName,String mobileNo,
                    String dateOfBirth,String schoolName,String result) {
        this.name=name;
        this.fatherName=fatherName;
        this.mobileNo=mobileNo;
        this.dateOfBirth=dateOfBirth;
        this.schoolName=schoolName;
        this.result=result;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
