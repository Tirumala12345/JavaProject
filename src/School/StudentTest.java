package School;

public class StudentTest {
    Student getSchoolName (Student student){
        student.schoolName = "GKR High School";
        return student;
    }

    Student getSchoolNameDeepClone(Student student){
        Student cloneStudent=new Student();
        cloneStudent.name=student.name;
        cloneStudent.fatherName=student.fatherName;
        cloneStudent.mobileNo=student.mobileNo;
        cloneStudent.dateOfBirth=student.dateOfBirth;
        cloneStudent.schoolName="GKR High School";
        return cloneStudent;
    }
    Student  getStudentAddress(Student student){
        Student localStudent=new Student();
        localStudent.name=student.name;
        localStudent.fatherName=student.fatherName;
        localStudent.mobileNo=student.mobileNo;
        localStudent.dateOfBirth=student.dateOfBirth;
        localStudent.schoolName=student.schoolName;

        StudentAddress studentAddress=new StudentAddress();
        studentAddress.streetName="Benz Circle";
        studentAddress.city="Vijayawada";
        studentAddress.district="Krishna";
        studentAddress.state="Andhra Pradesh";
        studentAddress.pinCode="522501";
        localStudent.address=studentAddress;
        System.out.println("Address=" +localStudent.hashCode());
        return localStudent;
    }

    public static void main(String[] args) {

        Student stu = new Student();
        stu.name = "kiran";
        stu.fatherName = "surya";
        stu.mobileNo = "1234567890";
        stu.dateOfBirth = "01/01/2001";
        StudentTest test = new StudentTest();
        System.out.println("Name:" +stu.name);
        System.out.println("fatherName:" +stu.fatherName);
        System.out.println("Mobile Number:" +stu.mobileNo);
        System.out.println("Date Of Birth:" +stu.dateOfBirth);
        Student lateststudent=test.getSchoolNameDeepClone(stu);
        System.out.println("studentLatest SchoolName " +lateststudent.schoolName);
        System.out.println("Student SchoolName " +stu.schoolName);
        test.getSchoolNameDeepClone(stu);
        test.getStudentAddress(stu);
        System.out.println("Address=" +stu.hashCode());
    }
}