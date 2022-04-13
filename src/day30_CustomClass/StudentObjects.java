package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');

        // data type Student [] olan bi array oluşturduk
        Student[] students = {student1, student2, student3, student4, student5};

        //DATA TYPE STUDENT      STUDENTS ARRAY İSMİ ORTADAKİ DE EACH VEYA STUDENT GENEL İSİM
        for (Student student : students) {
            System.out.println(student);
            /*
            EACH STUDENT YAZDIRDI
            Student{name='Aygun', gender=F, age=39, ID=2210, grade=A}
            Student{name='Hulya', gender=F, age=26, ID=2123, grade=B}
            Student{name='Elminur', gender=F, age=26, ID=2215, grade=A}
            Student{name='Ali', gender=M, age=28, ID=5511, grade=B}
            Student{name='Mert', gender=M, age=26, ID=2252, grade=C}
             */
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
                //[Student{name='Aygun', gender=F, age=39, ID=2210, grade=A}, Student{name='Elminur', gender=F, age=26, ID=2215, grade=A}]
            }else{
                angryBirds.add(student);
                //[Student{name='Hulya', gender=F, age=26, ID=2123, grade=B}, Student{name='Ali', gender=M, age=28, ID=5511, grade=B}, Student{name='Mert', gender=M, age=26, ID=2252, grade=C}]
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);


    }
}
