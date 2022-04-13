package day30_CustomClass;

public class Student {
    //main metodu class içinde oluşturma. nesneleri oluşturduğun class ta oluştur.
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;
                        //değişken ismi metod içindeki ile dışındaki genel değişken ismi ile aynı olabilir ama ikisi farklıdır
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        //this ile set ınfoyu oluşturmak için yine sağ tıkla generate constructor ı sec, listeden hepsini seç ctrl+A
        // otomatik olarak class ismi yazar onu sil return type ve medot ismini yaz "void setInfo" yaz
        this.name = name;//isimleri aynı yaparsan instance(genel) değişken local değişken ile değişir.önlemek için this keyword kullanılıyor
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
