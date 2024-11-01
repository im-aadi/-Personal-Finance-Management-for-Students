class SavingsGoalManager {
    private double savingsGoal;
    private double currentSavings;

    public SavingsGoalManager(double goal) {
        this.savingsGoal = goal;
        this.currentSavings = 0;
    }

    public void addSavings(double amount) {
        currentSavings += amount;
        System.out.println("Added $" + amount + " to savings.");
        checkGoalProgress();
    }

    public void checkGoalProgress() {
        double progress = (currentSavings / savingsGoal) * 100;
        System.out.printf("Current Savings: $%.2f (%.2f%% of your goal)\n", currentSavings, progress);
        if (currentSavings >= savingsGoal) {
            System.out.println("Congratulations! You've reached your savings goal!");
        }
    }
}
