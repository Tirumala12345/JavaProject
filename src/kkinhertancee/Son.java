package kkinhertancee;

public class Son extends Father {
    public void name() {
        System.out.println("mother name");
    }

    public void number() {
        super.name();
        System.out.println("12334");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.name();
        son.number();

    }
}