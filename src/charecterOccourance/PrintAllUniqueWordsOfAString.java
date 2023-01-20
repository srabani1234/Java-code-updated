package charecterOccourance;

public class PrintAllUniqueWordsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		
		
		
		
		
		
		
		String str ="Java is great.Python is also great."; 
		
		String[] words = str.replace("."," ").split(" ");
		int freq[] =new int[words.length];
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
           freq[i]=1;
             for(int j=i+1;j<words.length;j++) {
            	//System.out.println(words[j]);
            	
               if(words[i].equalsIgnoreCase(words[j])) {
            	   
            	  
            	   freq[i]++;
            	   words[j]="";
            	   
               }
            	
             }	
            
		}
		for(int i=0;i<freq.length;i++) {
			
			if(words[i]!="" 
					&& freq[i]==1) {
				
				System.out.println(words[i]+""+freq[i]);
			}
		}

	}

}
