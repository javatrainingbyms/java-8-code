package in.serosoft;

public class ResultProcessing {
	public static String computeGrade(Grader grader, int totalMarks, int marksObtained) {
		return grader.grade(totalMarks, marksObtained);
	}

	public static void main(String[] args) {
		/*
		 * Grader grader=(totalMarks, marksObtained)->{ int
		 * percentage=marksObtained*100/totalMarks; if(percentage>=60) {
		 * System.out.println("Grade-A"); }else { System.out.println("Grade-B"); } };
		 */
		/*
		String gradeObtained = computeGrade((totalMarks, marksObtained) -> {
			int percentage = marksObtained * 100 / totalMarks;
			String grade = "";
			if (percentage >= 60) {
				grade = "Grade-A";
			} else {
				grade = "Grade-B";
			}
			return grade;
		}, 500, 200);
		*/
		
		Grader grader=new Result()::gradeCompute;
		String gradeObtained=computeGrade(grader, 500,340);
		//String gradeObtained=computeGrade(Result::gradeCompute,500,340);
		System.out.println(gradeObtained);
	}

}
