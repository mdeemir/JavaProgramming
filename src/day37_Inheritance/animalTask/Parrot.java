package day37_Inheritance.animalTask;



    public class Parrot extends Animal {

        // public String parrotWingColor; ---> ekstra parametre ekledik

        public Parrot(String name, String breed, char gender, int age, String size, String color) {
            super(name, breed, gender, age, size, color);
            // this.parrotWingColor = parrotWingColor;---> ekstra parametre ekledik parot clastan oluşturuşacak nesneler için
            //public Parrot(String name, String breed, char gender, int age, String size, String color, String parrotWingColor)
            //yukarıaki gibi cons ı düzenlemelisin
        }

        public void sing(){
            System.out.println(name+" is singing");
        }


    }

