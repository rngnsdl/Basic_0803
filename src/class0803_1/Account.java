package class0803_1;

public class Account {
	String ownerName; // 예금주 이름
	int accountNumber; // 계좌번호
	int balance; // 잔고
	
	public void deposit(int a) { // 잔고를 주어진 입금액만큼 증가
		this.balance = a+balance;
	}
	
	public void withdraw(int a){//잔고를 주어진 출금액만큼 감소
		if(a<balance)
			System.out.println("현 잔고가 충분하지 않습니다.");
		else
			this.balance = balance-a;
	}
	
	@Override
	public String toString() {
		String resultString = "";
		resultString = "예금주 이름: "+ownerName+getOwnerName()+"\n"+"계좌번호: "+getAccountNumber()+"\n"+"잔고: "+getBalance();
		return resultString;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
