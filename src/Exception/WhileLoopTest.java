package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class WhileLoopTest {
    public static void main(String[] args) throws InterruptedException {

        Calendar cal = Calendar.getInstance();
        Date currentTime = cal.getTime();


        cal.add(Calendar.MINUTE, 1);
        Date endTime = cal.getTime();




        while (currentTime.before(endTime)) {
            try {

                FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Siva Krishna\\OneDrive\\Desktop\\mountain\\krish1.txt");

                System.out.println("File found!");
                break;
            } catch (FileNotFoundException e) {

                System.out.println("File not found. Retrying...");
            }


            Thread.sleep(1000);


            cal = Calendar.getInstance();
            currentTime = cal.getTime();
            


        }
    }
}


