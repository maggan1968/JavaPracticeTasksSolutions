package day11_SwitchStatements;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "grande";
        double price = 0.0;
        int calories = 0;

        switch(size) {
            case "tall":
                price = 3.69;
                calories = 90;
                break;

            case "grande":
                price = 3.99;
                calories = 120;
                break;

            case "venti":
                System.out.println("Venti cappuccino please");
                price = 4.29;
                calories = 150;
                break;

            default:
                System.err.println("Invalid Size: "+size);
        }

        if(price != 0) {
            System.out.println("Price is: $" + price);
            System.out.println(calories+" calories");
        }



    }

}
