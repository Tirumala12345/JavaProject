package healthCare;

public class Fever implements Consultation{
    double height;
    double weight;
    double bmi;
    @Override
    public double BMI(double height, double weight) {
        bmi=weight/(height*2);
        //System.out.println("BMI Is " +bmi);
        return bmi;
    }

    @Override
    public double bloodSample(int amtOfBlood) {
        int quantityOfBlood=amtOfBlood;
        return quantityOfBlood;
    }
}
