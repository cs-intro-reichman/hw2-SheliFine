// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int termsNumber = Integer.parseInt(args [0]);
		double sum = 0;

		for (int i = 1; i <= termsNumber * 2; i += 4){
			// adds 4 to the denominator for + fractions
			sum += 1.0 / i;
			if (i + 2 <= termsNumber * 2){
				// adds 2 to the denominator for - fractions
				sum -= 1.0 / (i + 2);
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
