package day09.practice;

public class FindingAverage {

	public static void main(String[] args) {
		int[] num= {5,5};
		int sum=0;
		int average =0;
		
		for(int i=0;i<num.length;i++) {
			sum +=num[i];// Summing up each element
			
			System.out.println("sum is "+ sum);
			
			//dividing the sum to the length of number to find average 
			
		  average= sum / num.length;
		  
			 
			
			
		}
		System.out.println("average is "+average);
	}	
		
	}

