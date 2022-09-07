package charecterOccourance;

public class ReturnSumofDigitsPresentInTheGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      String str =  "ab5c2d4ef12s";
	      String res="";
	      int sum=0;
	      for(int i=0;i<str.length();i++) {
	    	  if(Character.isDigit(str.charAt(i))) {
	    		  System.out.println(str.substring(i,i+1));
	    		  int a=Integer.parseInt(str.substring(i,i+1));
	    		  System.out.println(a);
	    		  sum=sum+Integer.parseInt(str.substring(i,i+1));
	    	  }else
	    		  res=res+str.charAt(i);
	    	  
	      }
	      System.out.println(sum);

	      System.out.println(res);
	}

}
