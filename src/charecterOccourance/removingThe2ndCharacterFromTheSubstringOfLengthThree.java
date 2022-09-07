package charecterOccourance;

public class removingThe2ndCharacterFromTheSubstringOfLengthThree {

	/*Write a Java program to create a new string from a given string after removing the 
	 * 2nd character from the substring of 
	 * length three starting with 'z' and ending with 'g' presents in the said string. Go to the editor

Sample Output:

The given string is: zzgkitandkatcaketoket
The new string is: zgkitandkatcaketoket
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="zzgkitandkatcakezwgtoket";
		String rev="";
		for(int i=0;i<str.length();i++) {
			
			//rev=rev+str.substring(i,i+1);
			rev=rev+str.charAt(i);//zz
			System.out.println("i"+i+"\n");
		//
			//System.out.print(str.length()-1);
			if(i>0 && i<str.length()-1) { 
				System.out.println("rev:"+rev+"\n");////rev=:z	
//				System.out.print("st:"+str.charAt(i-1)+"\n");
//				System.out.print("en:"+str.charAt(i+1)+"\n");
//				System.out.print(str+" ");
				if(str.charAt(i-1)=='z' && str.charAt(i+1)=='g') {
				
					rev=rev.substring(0,rev.length()-1);
					System.out.println("new rev:"+rev);
				}
				
				}
			}
			
		System.out.println(rev);
		}
		

}

