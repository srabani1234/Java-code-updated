package charecterOccourance;

public class checkWhetherTwoStringsOflength3And4AppearInSameNumberOfTimes {
/* Write a Java program to check whether two strings of length 3 and 4 appear in same number of times in a given string. Go to the editor

Sample Output:

The given string is: redcapmanwithbluecar
The appearance of red and blue are same: true*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="redcapmanwithbluecar";
		String subStr="";
		String subStr1="";
		int count=0;
		int count1=0;
		for(int i=0;i<str.length()-2;i++) {
			
			subStr = str.substring(i,i+3);
			
			
			if(subStr.equals("red")) {
				System.out.println(subStr);
				count++;
			}
		
			
			
		}
	for(int i=0;i<str.length()-3;i++) {
			
		subStr1 = str.substring(i,i+4);
		
			if(subStr1 .compareTo("blue")==0) {
				System.out.println(subStr1);
			 count1++;	
			}
			
			
		}
		if(count1==count) {
			
			System.out.print(count);
			System.out.print(count1);
		}
	}

}
