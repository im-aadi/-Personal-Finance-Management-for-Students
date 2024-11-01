import java.util.*;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;



class ExpenseManager {
    private List<Expense> expenses;
    private Map<String, Double> categoryTotals;

    public ExpenseManager() {
        expenses = new ArrayList<>();
        categoryTotals = new HashMap<>();
    }

    public void addExpense(String category, double amount) {
        Expense expense = new Expense(category, amount);
        expenses.add(expense);
        categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + amount);
    }

    public void generateMonthlyReport() {
        System.out.println("Monthly Expense Report:");
        categoryTotals.forEach((category, total) -> 
            System.out.println("Category: " + category + " | Total: $" + total));
    }

    public double getTotalExpenses() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public Map<String, Double> getCategoryTotals() {
        return categoryTotals;
    }
}

class Expense {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
