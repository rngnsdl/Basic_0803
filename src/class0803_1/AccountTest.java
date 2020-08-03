package class0803_1;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccountNumber(101);
		account.setOwnerName("ȫ�浿");
		account.setBalance(10000);
		account.deposit(3000);
		account.withdraw(5000);
		System.out.println(account.toString());
		
		
	}

}
