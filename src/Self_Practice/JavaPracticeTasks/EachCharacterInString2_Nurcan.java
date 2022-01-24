package Self_Practice.JavaPracticeTasks;

public class EachCharacterInString2_Nurcan {

    public static void main(String[] args) {
        String[] words = {"Layan","Layan","Oleksandir","Olga","Adam","Adam","Adam","Cihad","Cihad","Cydeo"};

        String result="";


        for (String each : words) {// each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"

            int count=0;

            for (String element : words) {// element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (element.equals(each)){
                    count ++;


                }
            }
            if (result.contains(""+each)){
                continue;
            }
            result +=each+" ";
            result +=count+" ,";

        }
        System.out.println(result);

    }
}

