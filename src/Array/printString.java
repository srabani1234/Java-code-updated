package Array;

public class printString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Ind12ia45my";
String rev="";
String res="";
for(int i=0;i<str.length();i++) {
	
	if(!Character.isDigit(str.charAt(i))) {
		rev=rev+str.charAt(i);
		
	}else {
		
		res=res+str.charAt(i);
	}
}
System.out.println(rev+res);
	}

}
