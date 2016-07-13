package student;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {

	int rollNo;
	String name;
	double percentage;
	static int count;

	static void addCount() {
		count = count + 1;
	}

	public Student() {
		super();
		addCount();
	}

	static Student[] sortStudent(Student[] unsortedArray) {
		ArrayList<Student> arrayList = Arrays.asList(unsortedArray);
		arrayList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.percentage > o2.percentage ? -1 : (o1.percentage == o2.percentage ? 0 : 1);
			}
		});
		return ArrayLists.asArray(arrayList);
	}

	static class Arrays {
		static ArrayList<Student> asList(Student[] unsortedArray) {
			ArrayList<Student> arrayList = new ArrayList<>(unsortedArray.length);
			for (int i = 0; i < unsortedArray.length; i++) {
				int rollNo = unsortedArray[i].rollNo;
				String name = unsortedArray[i].name;
				double percentage = unsortedArray[i].percentage;
				arrayList.add(new Student(rollNo, name, percentage));
			}
			return arrayList;
		}
	}

	static class ArrayLists {
		static Student[] asArray(ArrayList<Student> arrayList) {
			Student[] studArray = new Student[arrayList.size()];
			for (int i = 0; i < arrayList.size(); i++) {
				Student student = arrayList.get(i);
				studArray[i] = student;
			}
			return studArray;
		}
	}

	public Student(int rollNo, String name, double percentage) {
		super();
		addCount();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}

}
