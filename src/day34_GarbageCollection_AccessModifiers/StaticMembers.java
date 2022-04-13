package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // statci koyamazsın başına buna izin vermez
    //outer class static olamaz

    int a;
// static class oluşturulabilir ama bir oö koşulu var: nested class
    //inner class olusturduk. yani nested class oluşturduk. static class olurturmanın tek yolu NESTED CLASS oluşturmak.
   // nested class yoksa static class da yok
    // public class bir tane olur.
    class class1{

    }

    public static int num = 100;

    public static void method(){

    }

    static{

    }

}


class A { // outer class

    static class B { // inner class static olabilir. çünkü outer classın bir üyesi oldu

        public static void method1(){

        }

    }

}


class C{
    public static void main(String[] args) {
        A.B.method1();// çağırmak için önce outer class sonra innr class sonra inner class ın metodu
    }
}


class X{

}

class Y{

}

class Z{//outer class
    static class Q{//inner class

    }
}
