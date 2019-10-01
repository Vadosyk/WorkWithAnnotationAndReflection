package ua.kiev.prog;

public class MyClass {

    @ TestAnnotation (a=2, b=5)
    public void test (int a, int b){
        System.out.println("The sum of param is " + (a+b));
    }
}
