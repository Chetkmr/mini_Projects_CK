
import java.util.Scanner;

public class app {

    public static void main(String args[]) {
        System.out.println("Wlecome to app");
        // userInrToOther();
        user1stOption();
    }

    public static void user1stOption() {   //chose int to other || other to inr
        Scanner userRead1st = new Scanner(System.in);
        System.out.println("Chouse Your Option");
        System.out.println("1. INR To Other Currence");
        System.out.println("2. Other to INR Currence");

        int Choice = userRead1st.nextInt();

        switch (Choice) {
            case 1:
                userInrToOther();
                break;
            case 2:
                userOtherToInr();
                break;
            default:
                System.out.println("You only chose on this option");
                System.out.println("Please try again");
                break;
        }
    }

    public static void userOtherToInr() {
        Scanner userReadOtherToInr = new Scanner(System.in);

        System.out.println("Chouse your currency to convert INR");
        System.out.println("1. USD");
        System.out.println("2. YEN");
        System.out.println("3. UAE");
        System.out.println("4. EURO");

        int Choice = userReadOtherToInr.nextInt();

        System.out.println("Enter Amount to Convert");
        double otherAmount = userReadOtherToInr.nextInt();

        // double userReadOtherToInr = 0;
        switch (Choice) {
            case 1:
                double convertedMoney = otherAmount * 90.56;
                System.out.println(otherAmount + " Amount is Converted into " + convertedMoney);
                break;
            case 2:
                convertedMoney = otherAmount * 0.60;
                System.out.println(otherAmount + " Amount is Converted into " + convertedMoney);
                break;
            case 3:
                convertedMoney = otherAmount * 110.57;
                System.out.println(otherAmount + " Amount is Converted into " + convertedMoney);
                break;
            case 4:
                convertedMoney = otherAmount * 78.21;
                System.out.println(otherAmount + " Amount is Converted into " + convertedMoney);
                break;
            default:
                System.out.println("You only chose on this option");
                System.out.println("Please try again");
                break;
        }

    }

    public static void userInrToOther() {
        Scanner userRead = new Scanner(System.in);

        System.out.println("Chouse your INR currency to convert");
        System.out.println("1. USD");
        System.out.println("2. YEN");
        System.out.println("3. UAE");
        System.out.println("4. EURO");

        int Choice = userRead.nextInt();

        System.out.println("Enter the amount in INR");
        double inrAmount = userRead.nextDouble();

        double convertedAmount = 0;

        switch (Choice) {
            case 1:
                convertedAmount = inrAmount * 0.011;
                System.out.println(inrAmount + " INR amount is " + convertedAmount + " USD");
                break;
            case 2:
                convertedAmount = inrAmount * 1.70;
                System.out.println(inrAmount + " INR amount is " + convertedAmount + " YEN");
                break;
            case 3:
                convertedAmount = inrAmount * 0.041;
                System.out.println(inrAmount + " INR amount is " + convertedAmount + " UAE");
                break;
            case 4:
                convertedAmount = inrAmount * 0.0093;
                System.out.println(inrAmount + " INR amount is " + convertedAmount + " EURO");
                break;
            default:
                System.out.println("You only chose on this option");
                System.out.println("Please try again");
                break;
        }

    }
}
