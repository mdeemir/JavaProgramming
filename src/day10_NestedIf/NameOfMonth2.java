package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int number=5;
/*
        String result=""; // "" bu şekilde bir değer ata başta yoksa sonra hata verebilir

        if(number>=1 &&number<=12){ // if the number is valid
            if(number==1){
                result="January";
            }else if (number==2){
                result="February";
            }else if (number==3){
                result="MaArch";
            }else if (number==4){
                result="April";
            }else if (number==5){
                result="May";
            }else if (number==6){
                result="June";
            }else if (number==7){
                result="July";
            }else if (number==8){
                result="August";
            }else if (number==9){
                result="September";
            }else if (number==10){
                result="Oktober";
            }else if (number==11){
                result="November";
            }else {
                result="December";
            }
        }else { // if the number is not valid
            result="Invalid";
        }

 */
        // bir değer ve bir durum döndürüyor hepsi string ve tek değişken döndürüyor ternaries kullanılabilir

        String result2=(number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" :(number==4)? "Apr" :(number==5)? "May"
                :(number==6)? "June":(number==7)? "July" :(number==8)? "Aug" :(number==9)? "Sep" :(number==10)? "Oct"
                :(number==11)? "Nov" : "Dec";
        System.out.println(result2);



    }
}
