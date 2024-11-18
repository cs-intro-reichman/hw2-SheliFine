// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int termsNumber = Integer.parseInt(args [0]);
		double sum = 0;

		for (int i = 1; i <= termsNumber; i++){
			if (i % 2 == 0){
				sum += 1/i;
			} else {
				sum -= 1/i;
			}
			System.out.println(sum);
		}
	}
}
