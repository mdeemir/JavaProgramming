package day23_CustomMethods_Void;

public class CustomMethodsIntro {
    public static void main(String[] args) {
// static public void main(String[] args) ----> böyle de yazılabilir ama üstteki tavsiye edilie
        // metodu class içinde herhangi bir yere yazabilirsin alta veya üste sadece başka bir metodun içine yazma
        System.out.println("Test Started");

        greeting();
        greeting();

        System.out.println("Test Completed");


    }

// metodu oluşturduktan sonra minimize etmen tavsiye edilir
    public static void greeting(){

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");


    }
}
