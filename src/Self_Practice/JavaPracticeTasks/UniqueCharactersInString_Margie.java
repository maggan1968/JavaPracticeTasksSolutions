package Self_Practice.JavaPracticeTasks;

import java.util.Scanner;

public class UniqueCharactersInString_Margie {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.nextLine();

        String str ="AAABBBCCCDEF";
        String result = "";//DEF

        //First of all we have to find frequency of each character.to do that we have to compare with
        //this chart with every single characters of the String.First, second, third ,....character
        //    String str ="AAABBBCCCDEF"
        //     String result = "";//DEF
        //Iam also going to need a variable, that can help me to count how many times this character is matching
        //        char ch = 'A';
        //        int count = 0;
        //with the characters of the String, and for that purpose, I created this variable count so this variable
        // char contains the character and count it contains the frequency of that character from the string for those
        // two purpose. I created those two variables. And why I created this loop here?
        //        for (int i = 0; i < str.length(); i++)
        //ok, so For what purpose created this loop?
        //The reason we created this loop is because in order to find the frequency of this character => 'A'
        // I need to compare it with every single one => "AAABBBCCCDEF" of those characters that I have in the String
        // And charAt method.  It can get me every single characters.
        //in order to get nine characters is instead of calling this charAt method nine times
        // I can just create a loop  => for (int i = 0; i < str.length(); i++)
        // that can get me characters starting from index 0 till the last index so that way I created this for loop
        //And within this loop by using (i) as the index number Im able to get each character of the String
        //and now I have this Variable => each that representing each character of the String
        // So if I want to find the frequency of this char => ch  so I have to all of them compare with each characters
        // And if it matching I need to increase the count by 1  => count++;

        // so in that way we finding frequency of one character and in this String we have nine characters to repeat

        // so how should I repeat those steps? That way I will be able to find a frequency of not only "a' but
        // for every single characters.

        //Because we know that we have to repeated then we have to place them inside the loop
        // so this time let me declare the loop that's going to be the outer loop ==> for(int j = 0; j < str.length(); j++) {
// to be able to pick the characters ==> "AAABBBCCCDEF" so that I can so that the innoval later on it can return me frequency

        //In order for this loop to be able to pick the characters, I want this loop to have access to all the next numbers
        //starting from index 0 to the last
        //These are the statements that I wanted to repeat it for every single characters not only for character "A'.


        //  for (int j = 0; j < str.length(); j++) {
        // so these statements   they can be placed within this loop , and what when its placed
        //        char ch = 'a';
        //        int count = 0;// represents the frequency of the ch
        //        for (int i = 0; i < str.length(); i++) {
        //            char each = str.charAt(i);// each character of str
        //            if (ch == each){
        //                count++;

//I wanted to repeat those statements for character 'A' only? or I want to repeat it for every single
// character of the String
 //So I want this other loop to be able to pick the character during the each execution of the loop
// by using the variable J, I will get each of the characters
//         char ch = str.charAt(j);

        // So right here   for (int j = 0; j < str.length(); j++) {  for loop is doing?
        // Its taking the character  str.charAt(j);
        //and then in inner loop
        //  for (int i = 0; i < str.length(); i++) {
        //            char each = str.charAt(i);// each character of str
        //            if (ch == each){
        //                count++;

        //is going to compare that character with each characters of the String
        //And then whenever its matching, it's going to increase the variable count by 1.







/*this way you will find the one character
        char ch = 'A';
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

            //if condition
           /* if (count == 1) {// if the frequency of the character is 1, then the character is unique
                result += ch;
                */
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