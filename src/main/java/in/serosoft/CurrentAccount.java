package in.serosoft;


public class CurrentAccount implements Account {
	public void interest(int amount) {
		System.out.println("Interest On Current Account : "+(amount*8/100));
	}
}
