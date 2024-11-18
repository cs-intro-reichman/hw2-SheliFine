// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args [0]);
		String mode = args[1];

		for (int i = 1; i <= N; i++) {
			boolean firstStep = true;
			int seed = i;
			String hailstoneSeq = seed + " ";

			while (seed != 1 || firstStep) {
				firstStep = false;
				if (seed % 2 == 0){
					seed /= 2;	
				} else {
					seed = seed * 3 + 1;
				}
				hailstoneSeq += seed + " ";
			}

			if (mode.equals("v")) {
				System.out.println(hailstoneSeq);
			}
		}

		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
