package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Mustafa";
        String lastName = "Demir";
        int age=37;
        String jobTitle="SDET";
        String companyName="BEKO A.Ş";
        double salary=4250.45;
        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is "+fullName);

        System.out.println(fullName+" is "+age+ " years old");

        System.out.println(fullName+" is "+jobTitle+", works at "+companyName+", and "+fullName+ "'s salary is "+salary );

    }
}
