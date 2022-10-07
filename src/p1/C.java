package p1;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Bracket");
		String s = scan.next();

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {

				count1++;

			} else if (s.charAt(i) == ')') {

				count2++;
			}
		}
		if (count1 == count2) {

			System.out.println("its same");

		} else {

			System.out.println("not same");
		}
	}
}

