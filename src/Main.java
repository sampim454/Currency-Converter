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

        double euroAmount = (gbpAmount * 1.15);
        double usdAmount = (gbpAmount * 1.33);
        double jpyAmount = (gbpAmount * 211.21);
        double audAmount = (gbpAmount * 1.86);
        double cadAmount = (gbpAmount * 1.83);
        double dkkAmount = (gbpAmount * 8.57);

    userChoice = scanner.nextInt();
        switch (userChoice){
            case 1 -> System.out.println(gbpAmount + " converts to €" + (euroAmount));
            case 2 -> System.out.println(gbpAmount + " converts to $" + (usdAmount));
            case 3 -> System.out.println(gbpAmount + " converts to ¥" + (jpyAmount));
            case 4 -> System.out.println(gbpAmount + " converts to A$" + (audAmount));
            case 5 -> System.out.println(gbpAmount + " converts to C$" + (cadAmount));
            case 6 -> System.out.println(gbpAmount + " converts to " + (dkkAmount) + "kr.");
            default -> System.out.println("Option not available");
        }
        scanner.close();
    }
}