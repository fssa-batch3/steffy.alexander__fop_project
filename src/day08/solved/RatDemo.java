package day08.solved;

class Rat {
	int roomInBelly = 5;

	public void eatCheese(int bitesOfCheese) {
		// Keep eating as long as there is roomInBelly and some cheese
		// is left
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}
	public void showRoomInBelly() {
		System.out.println("Room in belly: " + roomInBelly);
	}
}

/**
 * Class for creating an instance of a Rat Class
 * @author BharathwajSoundarara
 *
 */
public class RatDemo {
	public static void main(String[] args) {
		Rat rat = new Rat();
		rat.roomInBelly = 5;
		rat.eatCheese(10);
		// Calling Belly Capacity
		rat.showRoomInBelly();
	}
}