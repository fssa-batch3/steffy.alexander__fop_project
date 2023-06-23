package day14.practice;


import day04.practice.Calculator;

public class ImportCalculator {
	
public static void main(String[] args) {
	Calculator calc=new Calculator();
	//creating method  calc by importing class from another package named as calculator
	System.out.println(calc.add(10,11));
	//calling the calc method by passing parameters and print it;
}
}
