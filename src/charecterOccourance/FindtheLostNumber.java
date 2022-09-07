package charecterOccourance;

public class FindtheLostNumber {
/*Input: 5 7 4 3 2 6

Output: 5

Explanation: There are 6 toy numbers out of which one is the length hence we print 5.

Input: 10 14 11 15

Output: -1

Explanation: There are 4 toy numbers but we do not have 3 as the value in the array hence we print -1.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		 // Taking input as string
        String s = "4 5 4 3 2 6";
        char[] ch=s.toCharArray();
        for(char c:ch) {
        	if(c==' ') {
        		count++;
        	}


        }
    System.out.println(count);
System.out.println(s.indexOf(Integer.toString(count)));
    // if the value count is present then print count
    // else print -1
    if (s.indexOf(Integer.toString(count)) != -1)
        System.out.println("Number of elements "
                           + count);
    else
        System.out.println(-1);
        

	}

}
