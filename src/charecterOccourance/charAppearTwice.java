package charecterOccourance;

/*Write a Java program to check whether the first instance of a given character is immediately 
 * followed by the same character in a given string. Go to the editor

Sample Output:

The given string is: fizzez
Is 'z' appear twice respectively? true*/
public class charAppearTwice {
	
	String str= "fizziz";
	String res="";
	//o/p-true ca zz present
	//o/p-false cz ziz present
	
	public boolean  m1() {
	
	for(int i=0;i<str.length();i++) {
		
		if (str.charAt(i) == 'z' && (res.length()==0?' ':res.charAt(res.length()-1)) == 'z')
	
			return true;
		else
		res=res+str.charAt(i);
		System.out.println(res);//fiziz
  
	}

	return false;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		charAppearTwice t=new charAppearTwice();
		t.m1();
		System.out.print(t.m1());
	}

}
