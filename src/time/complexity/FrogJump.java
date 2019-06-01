package time.complexity;
public class FrogJump {
	public static void main(String[] args) {

		int X = 10;
		int Y = 85;
		int D = 30;
		int diff = Y - X;
		int count = (int) Math.ceil((double) diff / (double) D);

		System.out.println(count);

	}
}
