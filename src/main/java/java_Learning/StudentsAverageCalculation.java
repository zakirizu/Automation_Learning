package java_Learning;

public class StudentsAverageCalculation {

	public static void main(String[] args) {
		
		int[] lokeshMarks = {46, 76, 66, 75};
		
		int sum = lokeshMarks[0]+lokeshMarks[1]+lokeshMarks[2]+lokeshMarks[3];		
		
		System.out.println("Total Marks are "+sum);
		float avg = sum/4f;		
		System.out.println("Avg Marks of Studend is "+avg);

	}

}
