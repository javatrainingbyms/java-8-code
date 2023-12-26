package in.serosoft;

public class BankingApp {

	static class LoanAccount implements Account {
		public void interest(int amount) {
			System.out.println("Interest On Loan Account : " + (amount * 5 / 100));
		}
	}

	public static void computeInterest(Account sa, int amount) {
		sa.interest(amount);
	} 

	public static void main(String[] args) {

		// SavingAccount account=new SavingAccount();
		// CurrentAccount account=new CurrentAccount();
		// LoanAccount account=new LoanAccount();
		/*
		 * Account account=new Account() {
		 * 
		 * @Override public void interest(int amount) {
		 * System.out.println("Interest On Anonomous Class.. ");
		 * 
		 * }
		 * 
		 * };
		 * 
		 * computeInterest(account, 5000);
		 */
		computeInterest((amount) -> {
			System.out.println("lambda ex. ");
			System.out.println("Interest With New Anon.");
		}, 5000);
	}

}
