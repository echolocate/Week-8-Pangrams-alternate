// This was originally written in JavaScript, to count number of letters
// needed for an order to a sign company.. 
// https://github.com/echolocate/Week-6-HLT--JS-Syntax-part-2-/blob/master/fruityLoops-stretch.js
// (Needs A LOT of work to change the JavaScript paradigm to Java
// but I think this might be a good approach eventually).
public class pangram {

	public static void main(String[] args) {
		// Sentence to check for pangram-ness (pangram-ality?)
	     String str = "sixty zippers were quickly picked from the woven jute bag";
	     // Reference alphabet for later comparison.
	     String alphabet = "abcdefghijklmnopqrstuvwxyz";
	     // Convert string into array, elements are
	     // the individual characters in string.
	     // Uses the toCharArray() method
	     char[] ch = str.toCharArray();
	     char[] alph = alphabet.toCharArray();

	     // Output the array elements to console
	     // to check conversion. Remove in final version.
	     for (char c : ch) {
	         System.out.println(c);
	     } // end for loop
	     
	     // Check alphabet conversion.
	     for (char a : alph) {
	         System.out.println(a);
	     } // end for loop
	     
	     // Trying to convert my original JavaScript
	     // function into a Java method.
	     // Had this as a separate class at one point.
	     // Gave up, being not quite confident enough.
	     
	     // Array of original sentence, loops through
	     // letters, comparing to alphabet, tallying 
	     // each occurrence to be called later.
	     public void countLetter(String[] c, String[] a) {
	    	    int count = 0;
	    	    for (int i = 0; i < a[].length(); i++) {
	    	        if (a[i] == c[]) {
	    	            count++;
	    	        } //end of if
	    	    } // end of for loop
	    	    return count;
	    	} // end of "function" (method)	     
	     
	     // Basically calls the countletter routine to display the 
	     // number of occurrences of each letter in alphabet.
	     // If missing any letters, outputs 'Not a pangram'.	     
	     for (int i = 0; i < alph.length(); i++) {
	    	    if (countLetter(alph[i], ch[]) >= 1) {
	    	    	System.out.println((countLetter(alph[i], ch[]) +  alph[i]);
	    	        // process.stdout.write(`${countLetter(alphabet[i], fruitString)} letter ${alphabet[i]},  `);
	    	    } // end of if
	    	    else { (System.out.println("Not a pangram")); }
	    	} // end of for loop

	}
}

