package day06.hots;

public class WordCount {
	public static void main(String[] args) {
		String sentence = "I hate java but java is challenging";

		String[] senc = sentence.split(" ");

		System.out.println(senc[0] +" -"+ senc[0].length());
		System.out.println(senc[1] +" -"+ senc[1].length());
		System.out.println(senc[2] +" -"+ senc[2].length());
		System.out.println(senc[3] +" -"+ senc[3].length());

	}
}
