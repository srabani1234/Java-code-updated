package charecterOccourance;

public class PrintSmallestAndBiggestPossiblePalindromeWordInAGivenString {

	
	public static boolean check(String str) {
		
		 String reverse="";
		 for(int i=str.length()-1 ;i>=0;i--) {
			 
			 reverse =reverse+str.charAt(i);
			// System.out.println(reverse);
			 
		 }
		 if(!reverse.toLowerCase().equals(str.toLowerCase())) {
			 return false;
		 }
		 return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "MALAYALAM Wow Madam is driving racecar";
        String[] st=str.split(" ");
        String small="";
        String larze="";
        int count=0;
        for(int i=0;i<st.length;i++) {
        	 String word=st[i];	
        	if(check(word)) {
            	count++;
            	// Initialize smallest and longest
                // when first palindromic word
                // is found
            	if(count==1){
            		small=word;
            		System.out.println("1st palindrom string"+small);
            		larze=word;
            		System.out.println("1st palindrom string"+larze);
            	}

            	else {
        		if(larze.length()<word.length()) {
        			//small=larze;
        			larze=word;
        			//System.out.println(word);
        			
        		}
        		
        		else if(small.length()>word.length() ) {
        			small=word;
        			//System.out.println(word);
        			
        		}
            	//System.out.println(word);
            	
        	}
        	}
        	
        }
         System.out.println(small);

    	
         System.out.println(larze);

	}

}
