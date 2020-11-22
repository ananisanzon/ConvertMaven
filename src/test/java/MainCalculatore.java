import java.util.ArrayList;
import java.util.Scanner;

public class MainCalculatore {
    private static ArrayList<Double> results;  //List of all results
    public static void main(String[] args) throws Exception {
        results = new ArrayList<>();

        //welcome screen, user choose convert to dolar/shekel
        System.out.println("Welcome to our calculator. We help you to calculate your amount to Dollar or Shekel.");
        int choiceToWhile = 1; // to recognize in while loop

        while (choiceToWhile == 1) { //if user chose convert to shekel or dollar only
            System.out.println("Please choose an option 1 , 2 or 3:");
            System.out.println("1- Dollars to shekels");
            System.out.println("2- Shekels  to dollars");
            System.out.println("3- Exit");

            //Daniel, this block never runs.
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            try{
                choice = scanner.nextInt();
            }catch (Exception e){
                System.out.println("User entered a forbidden key");
            }

            //if user's choice is wrong
            if (choice != 1 && choice != 2 && choice != 3)
            {
                throw new Exception("Wrong choice. Insert only 1,2,or 3.");
            } else if (choice == 3) //if exit
            {
                Coin ilsValue = CoinFactory.getCoinInstance(EnumCoins.EXIT);
                choiceToWhile = 0;
            }
            if (choice == 1) //if dollar to shekel
            {
                //user will insert the value to convert
                System.out.println("Insert the value to convert");
                double userValue = scanner.nextDouble();
                Coin ilsValue = CoinFactory.getCoinInstance(EnumCoins.ILS);
                System.out.println("Your amount is:");//result of convert
                double userSumILS = ilsValue.calculate(userValue);
                System.out.println((float) userSumILS + " " + "shekels");
                results.add(userSumILS);

            }
            if (choice == 2) //if shekels to dollar
            {
                //user will insert the value to convert
                System.out.println("Insert the value to convert");
                double userValue = scanner.nextDouble();
                Coin usdValue = CoinFactory.getCoinInstance(EnumCoins.USD);
                System.out.println("Your amount is:"); //result of convert
                double userSumUSD = usdValue.calculate(userValue);
                System.out.println((float) userSumUSD + " " + "dollars");
                results.add(userSumUSD);
            }
        }
        System.out.println("Thanks for using our currency converter");
        System.out.println("You all results: " + results);
    }
}