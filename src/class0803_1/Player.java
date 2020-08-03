package class0803_1;

public class Player {
	
	private String name; //선수이름
	private int total; //선수가 얻은 점수
	
	Player(String name){
		setName(name);
		total = 0;
	}
	
	Player(String a, String b){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void roll(PairOfDice dice) {
		int value1;
		int value2;
		
		dice.roll();
		value1 = dice.getFaceValue1();
		value2 = dice.getFaceValue2();
		total = value1+value2;
		System.out.println("\t주사위1: "+value1+" 주사위 2: "+value2+"점수: "+total);
	}
	
		int getTotal() {
			return this.total;
		}
	
	public String getName() {
		return name;
	}

}
