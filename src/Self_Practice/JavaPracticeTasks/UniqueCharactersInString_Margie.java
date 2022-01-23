package Self_Practice.JavaPracticeTasks;

import java.util.Scanner;

public class UniqueCharactersInString_Margie {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.nextLine();

        String str ="aabccdeef";
        String result = "";//bdf

/*this way you will find the one character
        char ch = 'a';
        int count = 0;// represents the frequency of the ch
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);// each character of str
            if (ch == each){
                count++;
            }
        }
        System.out.println(count);*/

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;// represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character
                char each = str.charAt(i);// each character of str
                if (ch == each) {
                    count++;
                    //after you find the character, witch is the unique?
                }

            }
           /* if (count == 1) {// if the frequency of the character is 1, then the character is unique
                result += ch;*/
            if (count!=1){ //if  is count!>1 is duplicate
                continue;
            }
            result += ch;
        }
        System.out.println(result);

    }


}
/*
6. Margie
Write a program that can find the unique characters from the String Ex: ("AAABBBCCCDEF") ==> "DEF";
 */