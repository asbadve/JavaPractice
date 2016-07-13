
public class Ass2A {

	static class Student {

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

		public Student(int rollNo, String name, double percentage) {
			super();
			addCount();
			this.rollNo = rollNo;
			this.name = name;
			this.percentage = percentage;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Student student = new Student(1, "Ajinkya", 0.0);
		Student student1 = new Student(1, "Ajinkya", 0.0);
		Student student2 = new Student(1, "Ajinkya", 0.0);
		Student student3 = new Student(1, "Ajinkya", 0.0);
		Student student4 = new Student();
		System.out.println("count" + student3.count);
	}

}
