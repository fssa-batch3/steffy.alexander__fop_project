package day08.practice;

public class PrintEvenNumber {
	public static void main(String[] args) {
//main function starts
		int num = 1;
		do {
			// dividing by 2 to find whether is even or not
			if (num % 2 == 0) {

				System.out.println("Even number are :" + num);
			}
			num++;

		} while (num <= 20);
	}
}
