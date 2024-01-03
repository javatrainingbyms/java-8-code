package in.serosoft;

import java.util.function.Predicate;

public class Admission {
	public static boolean isEligible(Student student, Predicate<Student> predicate) {
		return predicate.test(student);
	}
	public static boolean isEligible(int marks, Predicate<Integer> predicate) {
		return predicate.test(marks);
	}
	public static void main(String[] args) {
		//boolean result=isEligible(90, marks->marks>=80);
		boolean result=isEligible(new Student(1,"shubham",26,60), (student)->student.getAge()>=18 && student.getMarks()>=60);
		System.out.println("Result : "+result);
	}
}
