package day40_FinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "Cydeo"; //default access modifier ---> package dışında sub class ta görünmez
    protected static String name2 = "WoodenSpoon"; // protected ---> package dışında sadece subclass ta görünür


    static void method1(){

    }

    protected static void method2(){//---> package dışında sadece subclass ta görünür

    }


}