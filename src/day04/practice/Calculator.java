package day04.practice;

class CalculatorAll {
	public void Newmethod(){
	   add();
	   sub();
	   multiply();
	   div();
   }
	
	int a,b;
	
		public void add() {
			System.out.println("add= "+ (a+b));
		}
		public void sub() {
			System.out.println("sub= "+ (a-b));
		}
		public void multiply() {
			System.out.println("multiply= "+ (a*b));
		}
		public void div() {
			System.out.println("division= "+ (a%b));
		}
		
	}

public class Calculator{
	public static void main(String[] args) {
		
		CalculatorAll cal = new CalculatorAll();
		cal.a=9;
		cal.b=5;
		cal.Newmethod();
	}
}
