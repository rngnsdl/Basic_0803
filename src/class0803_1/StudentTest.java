package class0803_1;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("선남");
		student1.setAssingmentScore(91);
		student1.setExamScore(84);
		
		System.out.println(student1.toString());
		
		Student student2 = new Student();
		student2.setName("선녀");
		student2.setAssingmentScore(86);
		student2.setExamScore(95);
		System.out.println(student2.toString());
		
		Student [] student = new Student[2];
		for(int i=0; i<2; i++) {
			student [i] =new Student();
		}
		
		String [] name = {"선남","선녀 \n"};
		int [] assing = {91,86};
		int [] exam = {84, 95};
		
		for(int i=0; i<student.length; i++) {
			student[i].setName(name[i]);
			student[i].setAssingmentScore(assing[i]);
			student[i].setExamScore(exam[i]);
			
			// == student[1] = student1;
			// == student[2] == student2;
		}
		
			for(Student i: student) {
				System.out.println(i.getName());
				System.out.println(i.getAssingmentScore());
				System.out.println(i.getExamScore());
				// == System.out.println(i); == System.out.println(i.toString); -왜냐면 toString을 만들어 놨기 때문
			}
		}
}
