package in.serosoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentData {

	public static void main(String[] args) {
		
		//Student s1=new Student();
		Student s1=Student.builder().id(1501).name("mahendra").age(25).marks(85).build();
		Student s2=Student.builder().id(2101).name("ravindra").age(35).marks(45).build();
		Student s3=Student.builder().id(1401).name("ashish").age(28).marks(75).build();
		Student s4=Student.builder().id(3101).name("divesh").age(24).marks(65).build();
		List<Student> students=Arrays.asList(s1,s2,s3,s4);
		//Collections.sort(students);
		Comparator<Student> comparator=new Comparator<Student>() {

			@Override
			public int compare(Student st1, Student st2) {
				return st1.getMarks()-st2.getMarks();
			}
			
		};
		Collections.sort(students, comparator);
		for(Student student:students) {
			System.out.println(student);
		}

	}

}
