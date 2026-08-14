
import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter monthly income:");
        double monthlyIncome = sc.nextDouble();

        System.out.println("Enter rent expenses:");
        double rentExpenses = sc.nextDouble();

        System.out.println("Enter food expenses:");
        double foodExpenses = sc.nextDouble();

        System.out.println("Enter travel expenses:");
        double travelExpenses = sc.nextDouble();

        double totalExpense = rentExpenses + foodExpenses + travelExpenses;

        double remainingAmount = monthlyIncome - totalExpense;

        String status;

        if (remainingAmount >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);
        System.out.println("Status: " + status);

        sc.close();
    }
}
