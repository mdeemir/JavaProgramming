/*
2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
 */
package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        String name= "Mustafa Demir";
        int age = 37;
        char gender= 'M';
        String schoolName="Dokuz Eylül Üniversitesi";
        String phoneNumber= "+90(531)-831-8353";
        boolean ısFullTime=true;
        double GPA=93.94;


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("ısFullTime = " + ısFullTime);
        System.out.println("GPA = " + GPA);

    }
}
