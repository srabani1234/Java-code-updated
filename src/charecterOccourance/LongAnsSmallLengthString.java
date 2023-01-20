package charecterOccourance;

public class LongAnsSmallLengthString {
	 //f i z z e z
	  //1 2 3 4 5 6 7 8 9 1
	  public static void checkPalindrom(String str){
	 int max=0;
	 int min=0;
	  String[] words=str.split(" ");
	  for(int i=0;i<words.length;i++){
	   
	    max=words[0].length();
	    min=words[0].length();
	  
	   if(words[i].length()>max){

	     max=words[i].length();
	     
	   }
	   if(words[i].length()<min){
	     
	     min=words[i].length();
	   }
	  }
	System.out.println(max+" "+min);
	}
	  
	  public static void main(String[] args){

			String str ="players tesrttt play id";
	   checkPalindrom(str);
	    
	    }
	  



}
