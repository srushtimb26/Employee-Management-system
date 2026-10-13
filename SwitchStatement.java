package HelloWorld;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String month = sc.nextLine();

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Welcome to January");
                break;
            case "february":
                System.out.println("Welcome to February");
                break;
            case "march":
                System.out.println("Welcome to March");
                break;
            case "april":
                System.out.println("Welcome to April");
                break;
            case "may":
                System.out.println("Welcome to May");
                break;
            case "june":
                System.out.println("Welcome to June");
                break;
            case "july":
                System.out.println("Welcome to July");
                break;
            case "august":
                System.out.println("Welcome to August");
                break;
            case "september":
                System.out.println("Welcome to September");
                break;
            case "october":
                System.out.println("Welcome to October");
                break;
            case "november":
                System.out.println("Welcome to November");
                break;
            case "december":
                System.out.println("Welcome to December");
                break;
            default:
                System.out.println("Invalid month entered!");
                break;
        }

        sc.close();
    }
}