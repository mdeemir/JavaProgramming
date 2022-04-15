package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("-----------------------------------------------------------------");

        developer.setAge(39);//developer korkmaz ın  nesnesinin yaşını tekrar ayarladık

        System.out.println(developer.getAge());//39

        System.out.println(developer);//Employee{name='Korkmaz', age=39, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}

        System.out.println("-----------------------------------------------------------------");

        developer.work();//Java Developer Korkmaz is developing the application
        tester.work();//SDET Olga is testing the application
        teacher.work();// Math Teacher Daniel is teaching
        //  student.work();---> olmaz student personun child i personda work metodu yok. work metodu employee da

        System.out.println("------------------------------------------------------------");

        developer.eat();//personun child ı employee. person da eat vs. var
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        // tester.fixingBugs();----> olmaz çünkü develepor ın actionu
        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        // teacher.fixingBugs();---> olmaz developerın metodu
        //  teacher.createTicket();---> olmaz testerın metodu

        System.out.println("------------------------------------------------------------");

        student.eat(); //olur çünkü İS A person
        student.drink();
        student.sleep();

        // student.fixingBugs();----> olmaz developerın metodu
        // student.createTicket(); ---> olmaz testerın metodu
        student.study();






    }


}
