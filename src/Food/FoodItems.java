package Food;

public class FoodItems  {
    public String rice;
    public String curry;
    public FoodItems(){
        rice="Biryani";
        curry="Chicken";
    }

    @Override
    public String toString() {
        return "FoodItems{" +
                "rice='" + rice + '\'' +
                ", curry='" + curry + '\'' +
                '}';
    }
}
