package charecterOccourance;
//Java implementation of the approach
class stringManipulation1
{
// Function to get the resultant String after
// removing the required occurrences
//remove If 'a' appeared more than once continuously
// Driver code
	// Ignore all 'b' characters
public static void main(String args[])
{
	String str = "aaabcddabcddddabbbaacaaaaa";
	
	// String to store the resultant String
		String res = "";
		System.out.println(res.length());
		for (int i = 0; i < str.length(); i++) {

			// If 'a' appeared more than once continuously
			if (str.charAt(i) == 'a' && (res.length()==0?' ':res.charAt(res.length()-1)) == 'a')

				// Ignore the character
				continue;

			// Ignore all 'b' characters
			else if (str.charAt(i) == 'b')
				continue;

			// Characters that will be included
			// in the resultant String
			res = res + str.charAt(i);
			System.out.println(res);
			System.out.println("res"+res.length());

		}
	System.out.println(res);
}
}
//