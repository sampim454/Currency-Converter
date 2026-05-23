import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        userChoice = scanner.nextInt();

        scanner.close();

        print(gbpAmount, currencyChoice(userChoice), convert(userChoice, gbpAmount));

    }


    public static double convert(int userChoice, double gbpAmount) {
        double convertedAmount;
        switch (userChoice) {
            case 1 -> convertedAmount = (gbpAmount * 1.15);
            case 2 -> convertedAmount = (gbpAmount * 1.33);
            case 3 -> convertedAmount = (gbpAmount * 211.21);
            case 4 -> convertedAmount = (gbpAmount * 1.86);
            case 5 -> convertedAmount = (gbpAmount * 1.83);
            case 6 -> convertedAmount = (gbpAmount * 8.57);
            default -> convertedAmount = 0;
        }
        return convertedAmount;
    }

    public static void print(double gbpAmount, String currency, double convertedAmount) {
        System.out.println(gbpAmount + " converts to " + currency + " " + convertedAmount);
    }

    private static final String[] CURRENCIES = {"EUR", "USD", "JPY", "AUD", "CAD", "DKK"};

    public static String currencyChoice(int userChoice) {
        if (userChoice < 1 || userChoice > CURRENCIES.length) {
            return "";
        }
        return CURRENCIES[userChoice - 1];
    }
}