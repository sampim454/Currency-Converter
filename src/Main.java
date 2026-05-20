import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double gbpAmount;
        int userChoice;

        System.out.println("Please enter the GBP amount you would like to be converted: ");
        gbpAmount = scanner.nextDouble();

        System.out.println("To convert to Euro's please press 1");
        System.out.println("To convert to US Dollar's please press 2");
        System.out.println("To convert to Japanese Yen please press 3");
        System.out.println("To convert to Australian Dollar's please press 4");
        System.out.println("To convert to Canadian Dollar's please press 5");
        System.out.println("To convert to Danish Krone's please press 6");

        double usdAmount = (gbpAmount * 1.33);
        double jpyAmount = (gbpAmount * 211.21);
        double audAmount = (gbpAmount * 1.86);
        double cadAmount = (gbpAmount * 1.83);
        double dkkAmount = (gbpAmount * 8.57);

        userChoice = scanner.nextInt();

        scanner.close();

        print(gbpAmount, currencyChoice(userChoice), convert(userChoice, gbpAmount));

    }


    public static double convert(int userChoice, double gbpAmount) {
        double convertedAmount;
        switch (userChoice){
            case 1 -> convertedAmount = (gbpAmount * 1.15);
            default -> convertedAmount = 0;
        }
        return convertedAmount;
    }

    public static void print(double gbpAmount, String currency, double convertedAmount) {
        System.out.println(gbpAmount + " converts to " + currency + " " + convertedAmount);
    }

    public static String currencyChoice(int userChoice) {
        String currency = "";

        if (userChoice == 1){
            currency = "EUR";
        }
        if (userChoice == 2){
            currency = "USD";
        }
        if (userChoice == 3){
            currency = "JPY";
        }
        if (userChoice == 4){
            currency = "AUD";
        }
        if (userChoice == 5){
            currency = "CAD";
        }
        if (userChoice == 6){
            currency = "DKK";
        }
        return currency;
    }
}