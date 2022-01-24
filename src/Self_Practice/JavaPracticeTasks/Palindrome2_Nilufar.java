package Self_Practice.JavaPracticeTasks;

import java.util.Scanner;

public class Palindrome2_Nilufar {

    public static void main(String[] args) {
        String str = "";
        String reverse="";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");

        str = scan.nextLine();

        //int length = str.length();

        for(int i = str.length()-1; i>=0;i--){
            reverse=reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("is Palindrome");
        }else {
            System.out.println("is not Palindrome");
        }

    }
}
/*Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if it is not:
``
 */

