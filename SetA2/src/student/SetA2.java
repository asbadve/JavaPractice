package student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetA2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		Student[] studentsArray;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter how many student do you want in your class");
		n = Integer.parseInt(br.readLine());
		studentsArray = new Student[n];
		for (int i = 0; i < n; i++) {
			int rollNum = i + 1;
			System.out.println("Enter Name for roll number-" + rollNum);
			String name = br.readLine();
			System.out.println("Enter Percentage for roll number-" + rollNum);
			double percentage = Double.parseDouble(br.readLine());
			Student student = new Student(rollNum, name, percentage);
			studentsArray[i] = student;
		}

		System.out.println("sorted by percentage:-");
		studentsArray = Student.sortStudent(studentsArray);
		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println(studentsArray[i].toString());
		}

	}

}
