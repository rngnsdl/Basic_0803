package class0803_1;

public class Student {

	String name;
	int assingmentScore;
	int examScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssingmentScore() {
		return assingmentScore;
	}
	public void setAssingmentScore(int assingmentScore) {
		this.assingmentScore = assingmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	public char getGrade() {
		char grade = ' ';
		double total = 0;
		total= assingmentScore*0.4+examScore*0.6;
		if(total >= 90)
			grade = 'A';
		else if(total >=80)
				total = 'B';
		else if(total >=70)
			total = 'C';
		else if(total >=60)
			total = 'D';
		else
			total = 'F';
		return grade;
	}
	
	@Override
	public String toString() {
		String result="";
		result = "이름: "+getName();
		result = result + "과제점수: "+getAssingmentScore()+"\n";
		result = result + "시험점수: "+getExamScore()+"\n";
		result = result+"학점: "+getGrade()+"\n";
		return result;
	}
	
	
}
