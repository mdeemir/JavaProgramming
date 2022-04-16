package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0 ){
                list.remove(i);
            }
        }

        burada doğru sonuç vermez çünkü size değişken her seferinde değişiyor.bunun için removeIf() metodu kullanılmış
*/
        System.out.println(list);

        list.removeIf( p ->  p < 5 ); //Lambda Expression
        //syntax önemli (isim -> koşul)
        //p (predicate -p veya isim . bu değişken ismi ) -> (bu ifade javada reserved) ifadesi kullanmalısın sonra koşul p each elementi temsil ediyor

        System.out.println(list);//[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]  beşten küçükleri remove etti

        System.out.println("------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf( each ->  each%2 ==0 );
                    // p de yazabilirsin isim de verebilirsin
        System.out.println(list2);//[1, 3, 5, 7, 9]


        System.out.println("------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf( p ->  p.startsWith("J") );

        System.out.println(list3);//[Python, C#, C++]


        System.out.println("------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf( name -> !StringUtility.isPalindrome(name));//palindrom olmayanları çıkarmak iiçin
        // utilities package dan StringUtility class içindeki isPalindromw metodunu çağırdık
        System.out.println(names);//[Anna, Racecar, Level, Eye]





    }

}
