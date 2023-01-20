package charecterOccourance;

public class stringMainipulationPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc@#123$%";
		String rev="";
		String res="";
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				rev=rev+str.charAt(i);
				
			}
			else if(Character.isAlphabetic(str.charAt(i))) {
				res=res+str.charAt(i);
				
			}
			
			
		}

System.out.println(rev+str.substring(0)+res);
	}

}
