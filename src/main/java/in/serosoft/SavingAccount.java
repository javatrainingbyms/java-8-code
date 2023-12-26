package in.serosoft;

public class SavingAccount implements Account {
	public void interest(int amount) {
		System.out.println("Interest On Saving Account : "+(amount*10/100));
	}
}
