package in.serosoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentData {

	public static void main(String[] args) {
		
		//Student s1=new Student();
		Student s1=Student.builder().id(1501).name("mahendra").age(25).build();//.mar                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         s(85).build();
		Student s2=Student.builder().id(2101).name("ravindra").age(35).marks(55).build();
		Student s3=Student.builder().id(1401).name("ashish").age(28).marks(55).build();
		Student s4=Student.builder().id(3101).name("divesh").age(24).marks(65).build();
		List<Student> students=Arrays.asList(s1,s2,s3,s4);
		//Collections.sort(students);
		//Comparator<Student> comparator=(st1,st2)->st1.getMarks()-st2.getMarks();
		
		Collections.sort(students, (st1,st2)->{
			int n=st1.getMarks()-st2.getMarks();
			if(n!=0) {
				return n;
			}else {
				return st1.getAge()-st2.getAge();
			}
		});
		for(Student student:students) {
			System.out.println(student);
		}

	}

}
