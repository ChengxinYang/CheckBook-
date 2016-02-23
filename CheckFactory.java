package CheckBook;

public class CheckFactory {
	public CheckFactory(){}
	public CheckBook ChooseExpense(int i){
		switch(i){
		case 1:
			return new CarMaintenance();
		case 2:
			return new Insurance();
		case 3:
			return new Personal();
		default:
			return new Balance();
		}
	}
}
