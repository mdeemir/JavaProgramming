package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;//// access modifier: public
    static int defaultData = 200; // access modifier: default (başına YAZAMAZSIN default diye)
    private static int privateData = 300;// access modifier: private

    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }

}
