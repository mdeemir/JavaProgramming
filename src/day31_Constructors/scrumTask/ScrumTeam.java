package day31_Constructors.scrumTask;
/*
create a class called ScrumTeam
   Attributes:
        String PO, BA, SM;
        ArrayList<Tester> testersList = new ArrayList<>();
        ArrayList<Developer> devopsList = new ArrayList<>();
        int daysOfSprint;
       Add A constructor that can set the fileds PO, BA, and SM
     Actions:
          addTester(Tester tester): adds the given tester to the testers ArrayList
          addTesters(Tester[] testers): adds the given testers to the testers ArrayList
          addDeveloper(Developer developer): adds the given developer to the developers ArrayList
          addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
          removeTester(long employeeID): removes the given tester from the testers ArrayList
          removeDeveloper(long employeeID): removes the developer from the developers ArrayList
          toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    // hepsini secmedi array listler kaldı
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    // tek tester eklemek için
    public void addTester(Tester tester) {
        testersList.add(tester);
    }

    // tester arrayı eklemek için
    public void addTesters(Tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }

    //tek develepor eklemek için
    public void addDeveloper(Developer developer) {
        devopsList.add(developer);
    }

    // birden çok develepor eklemek için
    public void addDevelopers(Developer[] developers) {
        devopsList.addAll(Arrays.asList(developers));
    }

    //girilen employeeıd yi listeden kaldıran metod
    public void removeTester(int employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID) {
        devopsList.removeIf(p -> p.employeeID == employeeID);
    }
// toString(): prints number of tester,& developers,  PO name, SM name, BA name
    //requeriment a  göre toString metodu modife ettik
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';

    }
}
