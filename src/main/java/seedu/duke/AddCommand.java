package seedu.duke;

public class AddCommand extends Command {
    private Expense expense;

    public AddCommand(Expense expense) {
        this.expense = expense;
    }

    @Override
    public void execute(Managers managers, UI ui) throws ExpensiveLehException {
        ExpenseManager expenseManager = managers.getExpenseManager();
        expenseManager.addExpense(expense);
        ui.showMessage("Expense added successfully!"
                + "\n================================================"
                + "\nCategory : " + expense.getCategory()
                + "\nName     : " + expense.getDescription()
                + "\nValue    : $" + String.format("%.2f", expense.getAmount())
                + "\nDate     : " + expense.getFormattedDate()
                + "\n================================================"
                + "\nRemaining Budget: $" + String.format("%.2f", expenseManager.getRemainingBudget()));
    }
}
