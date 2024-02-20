package StudentMarks;


public class StudentValidationTest {
    public  boolean isPassed(Subject subject){
        System.out.println("from isPassed" + subject.subjectName);
        return subject.marks>=35;
    }
    public  boolean isPassedInHindi(Subject subject){
        System.out.println("from isPassedInHindi" + subject.subjectName);
        return subject.marks>=21;
    }
    Student1 getResult(Student1 inputStudent) {

        if (isPassed(inputStudent.marks.telugu)) {
            inputStudent.marks.telugu.result = "pass";
        } else {
            inputStudent.marks.telugu.result = "fail";
        }

        if (isPassed(inputStudent.marks.hindi)) {
            inputStudent.marks.hindi.result = "pass";
        } else {
            inputStudent.marks.hindi.result = "fail";
        }

        if (isPassed(inputStudent.marks.english)) {
            inputStudent.marks.english.result = "pass";
        } else {
            inputStudent.marks.english.result = "fail";
        }

        if (isPassed(inputStudent.marks.maths)) {
            inputStudent.marks.maths.result = "pass";
        } else {
            inputStudent.marks.maths.result = "fail";
        }

        if (isPassed(inputStudent.marks.science)) {
            inputStudent.marks.science.result = "pass";
        } else {
            inputStudent.marks.science.result = "fail";
        }

        if (isPassed(inputStudent.marks.social)) {
            inputStudent.marks.social.result = "pass";
        } else {
            inputStudent.marks.social.result = "fail";
        }

        if (inputStudent.marks.telugu.result.equals("Pass")
                && inputStudent.marks.hindi.result.equals("Pass")
                && inputStudent.marks.english.result.equals("Pass")
                && inputStudent.marks.maths.result.equals("Pass")
                && inputStudent.marks.science.result.equals("Pass")
                && inputStudent.marks.social.result.equals("Pass")
        ) {
              inputStudent.result="Pass";
        } else {
            inputStudent.result="Fail";
        }

       return inputStudent;
    }


    public static void main(String[] args){


        Subject teluguSubject=new Subject("Telugu",80,"Pass");


        Subject hindiSubject=new Subject("Hindi",75,"pass");


        Subject englishSubject=new Subject("English",85,"Pass");


        Subject mathsSubject=new Subject("Maths",95,"Pass");


        Subject scienceSubject=new Subject("Science",85,"Pass");


        Subject socialSubject=new Subject("Social",80,"Pass");


        Marks marks=new Marks(teluguSubject,hindiSubject,englishSubject,
                mathsSubject,scienceSubject,socialSubject);
        marks.telugu=teluguSubject;
        marks.hindi=hindiSubject;
        marks.english=englishSubject;
        marks.maths=mathsSubject;
        marks.science=scienceSubject;
        marks.social=socialSubject;

        Student1 student=new Student1("Tirumala","Narayana Reddy","1234567890",
                "01/01/2001","Aravinda High School","Pass");

        student.marks=marks;

        /*student.name="Tirumala";
        student.fatherName="Narayana Reddy";
        student.mobileNo="1234567890";
        student.dateOfBirth="01/01/2001";*/

        StudentValidationTest test=new StudentValidationTest();
        Student1 latestStudent=test.getResult(student);
        System.out.println(latestStudent);


    }
}

