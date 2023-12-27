package in.serosoft;

public class Result {
	public String gradeCompute(int totalMarks, int marksObtained) {
		int percentage = marksObtained * 100 / totalMarks;
		String grade = "";
		if (percentage >= 60) {
			grade = "Grade-A";
		} else {
			grade = "Grade-B";
		}
		return grade;
	}
}
