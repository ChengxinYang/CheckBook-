package CheckBook;

import java.util.Scanner;

public class Program {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Your deposit is: " + new CheckBook().Deposit);
		System.out.println("type 1 to display your CarMaintenance expense: ");
		System.out.println("type 2 to display your Insurance expense: ");
		System.out.println("type 3 to dispay your personal expense: ");
		System.out.println("type any number to display your balance: ");
		int i = sc.nextInt();
		CheckFactory check = new CheckFactory();
		CheckBook Expense = check.ChooseExpense(i);
		System.out.println("your " + Expense.name + " is: $" + Expense.getExpense());
		sc.close();
	}
}
