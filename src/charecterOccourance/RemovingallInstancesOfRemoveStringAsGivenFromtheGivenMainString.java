package charecterOccourance;

public class RemovingallInstancesOfRemoveStringAsGivenFromtheGivenMainString {
/*Write a Java program to return a substring after removing the all instances of remove string as given from the given main string. Go to the editor

Sample Output:

The main string is: This is the test string
The removable string is: st
The new string is: This is the te ring
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is the test string";
		String temp="";
	//	char[] ch=str.toCharArray();
//		String repaceS=str.replaceAll("st", " ");
//		System.out.println(repaceS);
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='s' && str.charAt(i+1)=='t') {
				//System.out.print(str.charAt(i+1));
				char ch=str.charAt(i);
				char ch1=str.charAt(i+1);
//				ch[i]=' ';
//				ch[i+1]=' ';
				ch=' ';
				ch1=' ';
				i=i+1;
				System.out.print(i);
				temp=temp+"";
			
				
			}else {
				temp=temp+str.charAt(i);
				//System.out.print(str.charAt(i));
			}
				
			}
			
			System.out.println(temp);
		}

	}


