package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);// bunu yazmazsan hem catch block hem de finally blok calışır.
            //yani manuel olarak System.exit(0); bunu yazmazsan finally blok herzaman calişir.
        }finally {
            System.out.println("Finally Block");
        }
/*
System.exit(0); YAZDIĞINDA KONSOL ÇIKTISI bu bir interview sorusu nasıl durdurursun finally blok u
"C:\Program Files\Java\jdk-11.0.12\bin\java.exe" -javaagent:C:\Users\GRUNDIG\AppData\Local\JetBrains\Toolbox\apps\IDEA-U\ch-0\213.6777.52\lib\idea_rt.jar=50464:C:\Users\GRUNDIG\AppData\Local\JetBrains\Toolbox\apps\IDEA-U\ch-0\213.6777.52\bin -Dfile.encoding=UTF-8 -classpath C:\Users\GRUNDIG\IdeaProjects\JavaProgramming\out\production\JavaProgramming day41_Exceptions.FinallyBlock
Catch Block
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
	at day41_Exceptions.FinallyBlock.main(FinallyBlock.java:9)

Process finished with exit code 0
 */
/*
System.exit(0); OLMADAN KONSOL ÇIKTISI
"C:\Program Files\Java\jdk-11.0.12\bin\java.exe" -javaagent:C:\Users\GRUNDIG\AppData\Local\JetBrains\Toolbox\apps\IDEA-U\ch-0\213.6777.52\lib\idea_rt.jar=50477:C:\Users\GRUNDIG\AppData\Local\JetBrains\Toolbox\apps\IDEA-U\ch-0\213.6777.52\bin -Dfile.encoding=UTF-8 -classpath C:\Users\GRUNDIG\IdeaProjects\JavaProgramming\out\production\JavaProgramming day41_Exceptions.FinallyBlock
Catch Block
Finally Block
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
	at day41_Exceptions.FinallyBlock.main(FinallyBlock.java:9)

Process finished with exit code 0
 */


    }
}
