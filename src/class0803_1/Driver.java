package class0803_1;



import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		String answer = "예";
		PairOfDice dice;
		
		Scanner input = new Scanner(System.in);
		
		dice = new PairOfDice();
		
		Player player1 = new Player("1번");
		Player player2 = new Player("2번");
		
		do {
			System.out.println(player1.getName());
			player1.roll(dice);
			System.out.println(player2.getName());
			player2.roll(dice);
			//승자확인
			if(player1.getTotal()>player2.getTotal())
				System.out.println("Player로 만든 첫번째 객체의 name의 getter가 이겼습니다.");
			else if(player1.getTotal()<player2.getTotal())
				System.out.println("Player로 만든 두번째 객체의 name의 getter가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
			
			System.out.println("\n게임을 계속하시겠습니까?(예 혹은 아니오):");
			answer= input.next();
		}while(answer.equals("예"));
		
	}

}