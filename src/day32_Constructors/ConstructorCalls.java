package day32_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this(); // Default Constructor
        System.out.println("Constructor with int argument");
    }


    public ConstructorCalls(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        /*
         this();
         this(10); bu şekilde yazamazsın çünkü kural ilk adımda yapmalısın
         yani tek satırda onun için yukarıdaki gibi yazmalısın çünkü o cons 1. yi de çağırıyor
         */
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();//Default Constructor

        System.out.println("----------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        /*
        Default Constructor
        java.lang.reflect.Constructor with int argument
        */

        System.out.println("----------------------------");

        ConstructorCalls obj3= new ConstructorCalls("Java");
/*
Default Constructor
Constructor with int argument
Constructor with String argument
 */

    }

}
