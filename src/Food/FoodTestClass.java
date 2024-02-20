package Food;

public class FoodTestClass {
    public static void main(String[] args){
        FoodItems food=new FoodItems();
        food.rice="Plain Rice";
        food.curry="Potato";

        Family family=new Family("Tirumala","Narayana Reddy","Naga Mani",
                "Supriya",food);
        System.out.println("Home Food" + family);
        Family family1=new Family("Tirumala"," Narayana Reddy","Naga Mani",
                "Supriya");
        System.out.println("Outside Food" + family1);
    }
}
