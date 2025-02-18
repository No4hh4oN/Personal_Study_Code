package java_book;

import java.util.Comparator;
import java.util.Objects;

public class Ex37 {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}
}

class Student {
	int sno;
	Student(int sno) {
		this.sno = sno;
	}
}

class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno)
			return -1;
		else if (a.sno == b.sno) {
			return 0;
		}
		else {
			return 1;
		}
	}
}