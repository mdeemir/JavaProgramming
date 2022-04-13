package day25_CusomMethod_Overloading;

public class MainMethodOverloading {
// main metodu da overloading olabilir ama ilk sıradaki asıl main metodtur
    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }

}
