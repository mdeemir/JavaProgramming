package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Cydeo";

        String str2 = str.repeat(4); //"CydeoCydeoCydeoCydeo"

        System.out.println(str2);

        String s1 = "Wooden Spoon "; //Wooden SpoonWooden Spoon
        String s2 = s1.repeat(100);

        System.out.println(s2);

        System.out.println("------------------------------------------");

        System.out.println( "FADY\n".repeat(15) ); //"FADY" ifadesi de string illa değişken olması geekmez sonrasında nokta koy aynı

        System.out.println("-------------------------");

        String name = "Java";

        //  System.out.println(  name.repeat(5));

        System.out.println( (name +" ").repeat(5)   );

    }
}
