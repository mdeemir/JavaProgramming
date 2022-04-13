/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */
package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch= 'B';
        String result="";
        switch (ch){
            case 'A':
                result="Excellent";
                break;
            case 'B':
                result="Great";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";

        }

        System.out.println(result); // tek yazdırma komutu ile yapacaksan switch ten sonra komutu yazmalısın

    }
}
