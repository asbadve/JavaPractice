import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetAExtra1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double a, b, c;
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 1");
		a = Double.parseDouble(br.readLine());
		System.out.println("Enter number 2");
		b = Double.parseDouble(br.readLine());
		System.out.println("Enter number 3");
		c = Double.parseDouble(br.readLine());

		if (a > b && a > c) {
			System.out.println("Number 1 is max:" + a);
			if (b > c) {
				System.out.println("Number 3 is min:" + c);
			} else {
				System.out.println("Number 2 is min:" + b);
			}

		} else if (b > a && b > c) {
			System.out.println("Number 2 is max:" + b);
			if (a > c) {
				System.out.println("Number 3 is min:" + c);
			} else {
				System.out.println("Number 1 is min:" + a);
			}

		} else if (c > a && c > b) {
			System.out.println("Number 3 is max:" + c);
			if (b > a) {
				System.out.println("Number 1 is min:" + a);
			} else {
				System.out.println("Number 2 is min:" + b);
			}

		}

	}

}
