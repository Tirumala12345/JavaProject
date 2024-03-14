package staticdemo;

public class StaticDemo {
    public static int i=20;
    public int j=10;

    StaticDemo(){
        System.out.println("From Constructor");
    }
    static {
        System.out.println("From Static block");
    }
    {
        System.out.println("From Normal Block");
    }

    public static String helloworld(){
        return "Hello World";
    }

    public String sayHi(){
        return "Hi";
    }

    public static void main(String[] args) {
        System.out.println("From Main Method");
        StaticDemo staticDemo=new StaticDemo();
        System.out.println("Static " +StaticDemo.i);
        System.out.println("instance " +staticDemo.j);
        StaticDemo.i=100;
        staticDemo.j=100;
        System.out.println("Static " +StaticDemo.i);
        System.out.println("instance " +staticDemo.j);

        StaticDemo staticDemo1=new StaticDemo();
        System.out.println("Static " +StaticDemo.i);
        System.out.println("instance " +staticDemo1.j);
        StaticDemo.i=200;
        staticDemo1.j=200;
        System.out.println("Static " +StaticDemo.i);
        System.out.println("instance " +staticDemo1.j);

        StaticDemo staticDemo2=new StaticDemo();
        System.out.println("Static " +StaticDemo.i);
        System.out.println("instance " +staticDemo2.j);
        StaticDemo.i=100;
        staticDemo2.j=100;
        System.out.println("Static " +StaticDemo.i);
        System.out.println("instance " +staticDemo2.j);
    }
}
