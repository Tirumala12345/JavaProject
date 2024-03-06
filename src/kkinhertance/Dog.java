package kkinhertance;

public class Dog extends Animal{
//blic void sound(){
//stem.out.println("animal sound");
//
public void tail(){
System.out.println("Dog tail");
}

    public static void main(String[] args) {
        Dog dog=new Dog();
dog.sound();
dog.tail();
}
}