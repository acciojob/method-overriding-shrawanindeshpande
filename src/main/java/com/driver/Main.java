package com.driver;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.meth());
        System.out.println(b.meth());
    }
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    @Override
    String meth() {
        return "Method overridden in Extended class B";
    }
}