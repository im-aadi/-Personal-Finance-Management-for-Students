import java.util.Scanner;
import java.util.Map;





public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        System.out.print("Enter your savings goal: ");
        double goal = scanner.nextDouble();
        SavingsGoalManager savingsGoalManager = new SavingsGoalManager(goal);
        FinanceTips financeTips = new FinanceTips();

        while (true) {
            System.out.println("\nPersonal Finance Management");
            System.out.println("1. Add Expense");
            System.out.println("2. Set Savings");
            System.out.println("3. View Monthly Report");
            System.out.println("4. View Financial Insights and Tips");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.next();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    expenseManager.addExpense(category, amount);
                    break;
                case 2:
                    System.out.print("Enter savings amount: ");
                    double savings = scanner.nextDouble();
                    savingsGoalManager.addSavings(savings);
                    break;
                case 3:
                    expenseManager.generateMonthlyReport();
                    break;
                case 4:
                    financeTips.analyzeSpending(expenseManager.getCategoryTotals());
                    financeTips.displaySavingTips();
                    break;
                case 5:
                    System.out.println("Exiting Personal Finance Management. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
