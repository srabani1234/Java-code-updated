package charecterOccourance;

public class stringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc";
		String str1="test";
       
		str=str+str1;
		
		str1=str.substring(0,str.length()-str1.length());
		str= str.substring(str1.length());
		System.out.println(str);
		System.out.println(str1);
		
	}

}
