// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
                String wordToSpell = args[0];
                wordToSpell = wordToSpell.toUpperCase();
                String validationLetters = "AEFHILMNORSX";
                int timesToShout = Integer.parseInt(args [1]);


                for (int i =0; i < wordToSpell.length(); i++){
                        // first checks if has to print "an" or "a" according to the task
                        if (validationLetters.indexOf(wordToSpell.charAt(i)) == -1){
                                System.out.println("Give me a  " + + wordToSpell.charAt(i) +
                                ": " + wordToSpell.charAt(i) + "!");
                        } else {
                                System.out.println("Give me an " + wordToSpell.charAt(i) + ": " + wordToSpell.charAt(i) + "!");
                        }
                        
                }

        System.out.println("What does that spell?");
        for (int i = 0; i < timesToShout; i++){
                System.out.println(wordToSpell + "!!!");
        }
}
}
