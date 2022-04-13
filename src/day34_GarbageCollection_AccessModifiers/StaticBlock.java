package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static{ //runs first before anything, and only runs one time.her sınıfta bu geçerli main metodttan önce çalıştırılır
        System.out.println("Static Block 1");//bir kereden fazla yürütülmez ayrıca oluşturulur.
        //static block çağrılamaz. sadece bir kez yürütülür
    }

    static{
        System.out.println("Static Block 2");
    }

    static{
        System.out.println("Static Block 3");
    }
}
