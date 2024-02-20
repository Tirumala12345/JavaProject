package constructorOveroading;

public class Address {
    public String city;
    public String state;
    public String country;
    public String pinCode;

    public Address(){
        city="Vijayawada";
        state="AP";
        country="India";
        pinCode="522501";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
