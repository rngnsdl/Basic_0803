package class0803_1;



import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		String answer = "��";
		PairOfDice dice;
		
		Scanner input = new Scanner(System.in);
		
		dice = new PairOfDice();
		
		Player player1 = new Player("1��");
		Player player2 = new Player("2��");
		
		do {
			System.out.println(player1.getName());
			player1.roll(dice);
			System.out.println(player2.getName());
			player2.roll(dice);
			//����Ȯ��
			if(player1.getTotal()>player2.getTotal())
				System.out.println("Player�� ���� ù��° ��ü�� name�� getter�� �̰���ϴ�.");
			else if(player1.getTotal()<player2.getTotal())
				System.out.println("Player�� ���� �ι�° ��ü�� name�� getter�� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
			
			System.out.println("\n������ ����Ͻðڽ��ϱ�?(�� Ȥ�� �ƴϿ�):");
			answer= input.next();
		}while(answer.equals("��"));
		
	}

}