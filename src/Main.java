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

        userChoice = scanner.nextInt();

        convert(userChoice, gbpAmount);

        scanner.close();
    }

    //You can make a new method that would re-use logic
    public static void convert(int choice, double gpbAmount) {
        switch (choice) {
            case 1 -> System.out.println(gpbAmount + " converts to €" + (gpbAmount * 1.15));
            case 2 -> System.out.println(gpbAmount + " converts to $" + (gpbAmount * 1.33));
            case 3 -> System.out.println(gpbAmount + " converts to ¥" + (gpbAmount * 211.21));
            case 4 -> System.out.println(gpbAmount + " converts to A$" + (gpbAmount * 1.86));
            case 5 -> System.out.println(gpbAmount + " converts to C$" + (gpbAmount * 1.83));
            case 6 -> System.out.println(gpbAmount + " converts to K" + (gpbAmount * 8.57));
            default -> System.out.println("Option not available");
        }
    }
}