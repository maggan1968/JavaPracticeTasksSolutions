package Self_Practice.JavaPracticeTasks;

import java.util.Scanner;

public class Word_In_String_Rayka {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        int count = 0;
        String java = "java";


        for( int i = 0; i <= word.length()-java.length(); i++) {


            if(word.substring(i, i+4).equals(java)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
3. Rayka
Write a program that will count how many times “java” is found in any given String.
 */



