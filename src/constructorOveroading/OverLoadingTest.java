package constructorOveroading;

public class OverLoadingTest  {
    public static void main(String[] args) {
        Address address = new Address();
        address.city = "Vijayawada";
        address.state = "AP";
        address.country = "India";
        address.pinCode = "522501";
        Student student = new Student("Tirumala", "Narayana Reddy",
                "01/01/2001", "1234567890", address);
        System.out.println("Joining Student " + student);
        Student examStudent=new Student("Supriya","Narayana Reddy","01/01/2001",
                "1234567890");
        System.out.println("Exam Student " + examStudent);

    }
}
