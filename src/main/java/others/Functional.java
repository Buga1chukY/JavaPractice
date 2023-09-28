package main.java.others;

public class Functional {

    public void method1() {
        System.out.println("method1");
    }

    public void mothod2() {
        System.out.println("method2");
    }

    public void method3(String param1) {
        System.out.println("method3");

    }

    public void method4(String param1, String param2) {
        System.out.println("method4");
    }

    public void method5(String param1, String param2, String param3) {
        System.out.println("method5");
    }

    public void method6(int param1, Double param2, char param3, String param4) {
        System.out.println("method6");
    }

    public void method7(boolean param1, String param2, float param3, long param4) {
        System.out.println("method7");
    }

    public static void main(String[] args) {
        Functional a = new Functional();
        a.method1();
        a.mothod2();
        a.method3("Yaroslav");
        a.method4("lol", "olo");
        a.method5("hello", "world", "!!!");
        a.method6(3, 3.5, '$', "Hello");
        a.method7(true, "Hi", 1.5f, 123456);
    }

}
