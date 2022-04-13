package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet"); //sadece ismini girmeminin yeterli olduğu nesne oluşturma

        Student student2 = new Student("Aygun", 'F');//name+gender yeterli

        Student student3 = new Student("Nigara", 11);//name+gender+student ıd....

        Student student4 = new Student("Mert", 12, 'A');

        Student student5 = new Student("Cihad", 'M', 28);

        Student student6 = new Student("Suhaib", 'M', 27, 15);

        Student student7= new Student("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);//false


        Student[] students = { student1, student2, student3, student4, student5, student6, student7};


        System.out.println(Arrays.toString(students) );
        //[Student{name='Ahmet', gender= , age=0, studentID=0, grade= }, Student{name='Aygun', gender=F, age=0, studentID=0, grade= }, Student{name='Nigara', gender= , age=0, studentID=11, grade= }, Student{name='Mert', gender= , age=0, studentID=12, grade=A}, Student{name='Cihad', gender=M, age=28, studentID=0, grade= }, Student{name='Suhaib', gender=M, age=27, studentID=15, grade= }, Student{name='Ali', gender=M, age=42, studentID=30, grade=A}]
        //
        //Process finished with exit code 0



    }

}
