package Self_Practice.JavaPracticeTasks;

import java.util.Scanner;

public class Palindrome_Nilufar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        String reverse = "";
        boolean palindrome = true;
        boolean notPalindrome = false;

        System.out.println("Enter if a number is palindrome");
        str = scan.nextLine().toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println(palindrome);
        } else {
            System.out.println(notPalindrome);
        }
    }
}
/*
4. Nilufar
Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if it is not:

 */