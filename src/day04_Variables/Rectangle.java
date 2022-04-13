/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */

package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        int lenght=10; 
        int widht=15;
        int area=lenght*widht;
        int perimeter=2*(lenght+widht);

        System.out.println("lenght = " + lenght);
        System.out.println("widht = " + widht);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
