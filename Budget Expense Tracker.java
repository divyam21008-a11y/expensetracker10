
import java.util.Scanner;

public class BudgetExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget;
        double expense;
        double totalExpense = 0;
        double remainingBudget;

        int choice = 0;
        int expenseCount = 0;

        System.out.println("================================");
        System.out.println("     BUDGET EXPENSE TRACKER");
        System.out.println("================================");

        System.out.print("Enter your monthly budget: Rs. ");
        budget = sc.nextDouble();

        remainingBudget = budget;

        while (choice != 5) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. View Remaining Budget");
            System.out.println("4. View Expense Summary");
            System.out.println("5. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print(
                        "Enter expense amount: Rs. "
                    );

                    expense = sc.nextDouble();

                    if (expense > 0) {

                        totalExpense = totalExpense + expense;

                        remainingBudget = budget - totalExpense;

                        expenseCount = expenseCount + 1;

                        System.out.println(
                            "Expense added successfully!"
                        );

                        System.out.println(
                            "Amount spent: Rs. " + expense
                        );

                        System.out.println(
                            "Total spending: Rs. " + totalExpense
                        );

                        if (remainingBudget >= 0) {

                            System.out.println(
                                "Remaining budget: Rs. "
                                + remainingBudget
                            );

                        } else {

                            System.out.println(
                                "Warning! You have exceeded your budget."
                            );

                            System.out.println(
                                "Extra spending: Rs. "
                                + (-remainingBudget)
                            );
                        }

                    } else {

                        System.out.println(
                            "Invalid expense amount!"
                        );
                    }

                    break;

                case 2:

                    System.out.println("\n--- TOTAL EXPENSES ---");

                    System.out.println(
                        "Total amount spent: Rs. " + totalExpense
                    );

                    System.out.println(
                        "Number of expenses: " + expenseCount
                    );

                    break;

                case 3:

                    remainingBudget = budget - totalExpense;

                    System.out.println("\n--- BUDGET STATUS ---");

                    System.out.println(
                        "Monthly budget: Rs. " + budget
                    );

                    System.out.println(
                        "Total spending: Rs. " + totalExpense
                    );

                    System.out.println(
                        "Remaining budget: Rs. "
                        + remainingBudget
                    );

                    break;

                case 4:

                    System.out.println("\n--- EXPENSE SUMMARY ---");

                    System.out.println(
                        "Initial budget: Rs. " + budget
                    );

                    System.out.println(
                        "Total expenses: Rs. " + totalExpense
                    );

                    System.out.println(
                        "Number of expenses: " + expenseCount
                    );

                    System.out.println(
                        "Remaining balance: Rs. "
                        + (budget - totalExpense)
                    );

                    if (totalExpense > budget) {

                        System.out.println(
                            "Status: Budget exceeded!"
                        );

                    } else if (totalExpense == budget) {

                        System.out.println(
                            "Status: Entire budget used."
                        );

                    } else {

                        System.out.println(
                            "Status: Within budget."
                        );
                    }

                    break;

                case 5:

                    System.out.println(
                        "\nThank you for using Budget Expense Tracker!"
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }
        }

        sc.close();
    }
}
