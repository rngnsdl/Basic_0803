package class0803_1;

public class Account {
	String ownerName; // ������ �̸�
	int accountNumber; // ���¹�ȣ
	int balance; // �ܰ�
	
	public void deposit(int a) { // �ܰ� �־��� �Աݾ׸�ŭ ����
		this.balance = a+balance;
	}
	
	public void withdraw(int a){//�ܰ� �־��� ��ݾ׸�ŭ ����
		if(a<balance)
			System.out.println("�� �ܰ� ������� �ʽ��ϴ�.");
		else
			this.balance = balance-a;
	}
	
	@Override
	public String toString() {
		String resultString = "";
		resultString = "������ �̸�: "+ownerName+getOwnerName()+"\n"+"���¹�ȣ: "+getAccountNumber()+"\n"+"�ܰ�: "+getBalance();
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
