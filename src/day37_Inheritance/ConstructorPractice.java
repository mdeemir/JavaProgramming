package day37_Inheritance;

class A{

    public A(int a){// cons değişken içerdiği için super ile manual çağırma yapıyoruz.
        //public A()---> bu default cons. bu olursa super otomatik yğkleniyor
        System.out.println("A");
    }


}

class B extends A{

    public B(){
        super(9);
        System.out.println("B");
    }

}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();

    }

}