import java.util.Map;



class FinanceTips {
    public void analyzeSpending(Map<String, Double> categoryTotals) {
        System.out.println("\nFinancial Insights:");
        categoryTotals.forEach((category, total) -> {
            if (total > 100) {
                System.out.println("You are spending a lot on " + category + ". Consider reducing expenses in this category.");
            } else {
                System.out.println("Your spending on " + category + " is under control.");
            }
        });
    }

    public void displaySavingTips() {
        System.out.println("\nSaving Tips:");
        System.out.println("- Set aside a fixed amount each month for savings.");
        System.out.println("- Avoid impulse buying by sticking to a budget.");
        System.out.println("- Consider using discounts and coupons to save money.");
    }
}
