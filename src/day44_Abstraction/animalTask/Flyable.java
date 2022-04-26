package day44_Abstraction.animalTask;

public interface Flyable {
/*
sadece sub classlar için değil ANY class için de kullanılabilir. mesella animal classın sub clası olmaya airplane class ı da
flyable interface ı kullaaanablir.


 */
    boolean canFly = true;

    void fly();

}
