package CheckBook;

public class Balance extends CheckBook{
	public Balance(){
		name = "Balance";
		Personal personal = new Personal();
		Insurance insurance = new Insurance();
		CarMaintenance carmaintenance = new CarMaintenance();
		Amount = Deposit - personal.getExpense() - insurance.getExpense() - carmaintenance.getExpense();
	}
}
