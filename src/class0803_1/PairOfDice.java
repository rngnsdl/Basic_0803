package class0803_1;

public class PairOfDice {
	
	int faceValue1;
	int faceValue2;
	
	PairOfDice(){ // 최초 주사위 숫자를 1로 만드는 기능
		this.faceValue1 = 1;
		this.faceValue2 = 1;
	}
	
	public void roll() {
		this.faceValue1 = (int)(Math.random()*6+1);
		this.faceValue2 = (int)(Math.random()*6+1);
	}
	
	public int getFaceValue1() {
		return this.faceValue1;
	}
	
	public int getFaceValue2() {
		return this.faceValue2;
	}
}
