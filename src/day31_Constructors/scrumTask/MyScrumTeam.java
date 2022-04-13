package day31_Constructors.scrumTask;
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
public class MyScrumTeam {

    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000 );
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);

        Tester[] testers = {tester2, tester3, tester4};// testes array ı

        //4 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers = {developer2, developer3, developer4};//developers array ı

        // 1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper( developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers( developers );

        System.out.println(scrum);//ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total number of testers=4, total number of developers=4, daysOfSprint=14}

        System.out.println("------------------------------------------------------");

        for(Tester eachTester : scrum.testersList ){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
            /*
            Layan : 110000.0
            Ali : 142000.0
            Alex : 135000.0
            Lala : 115000.0
             */
        }

        System.out.println("------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
            /*
            Olga : 125000.0
            Aygun : 185000.0
            Tunc : 135000.0
            Sinem : 200000.0
             */
        }

        System.out.println("------------------------------------------------------");

        scrum.removeTester( 23 );// ıd si 23 olan tester kaldırıldı listeden
        scrum.removeDeveloper( 22 );//// ıd si 22 olan tester kaldırıldı listeden

        System.out.println(scrum);//ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total number of testers=3, total number of developers=3, daysOfSprint=14}
        //tester ve developersayıları 4 ten 3 e düştü


    }

}
