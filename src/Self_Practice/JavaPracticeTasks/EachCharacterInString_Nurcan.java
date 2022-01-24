package Self_Practice.JavaPracticeTasks;

import java.util.Scanner;

public class EachCharacterInString_Nurcan {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(countLetters(scan.next()));
    }

    public static String countLetters(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {//each character of from string
            char ch=str.charAt(i);
            int countLetters=0;

            for (int j = 0; j < str.length(); j++) {//to find the frequency of each character
                char each=str.charAt(j); //each character of str
                if (ch==each){
                    countLetters ++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result +=ch;
            result +=countLetters;

        }

        return result;
    }

}
/*
5. Nurcan
Given any String print out how many times each character is found in the String
 */