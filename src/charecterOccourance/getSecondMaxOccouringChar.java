package charecterOccourance;

public class getSecondMaxOccouringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "perfect picture";
     char[] ch = str.toCharArray();
     
     int[] count = new  int[str.length()];
     
     System.out.println(count.length);
     for(int i = 0; i <ch.length; i++) {  
         count[i] = 1;  
         for(int j = i+1; j <ch.length; j++) {  
             if(ch[i] == ch[j]) {  
                 count[i]++;  
               //  System.out.println(ch[i]+""+ch[j]+""+count[i]);  
                 //Set string[j] to 0 to avoid printing visited character  
                 ch[j] = '0';  
                // System.out.println(string[i]+""+string[j]+""+freq[i]);
             }  
         }  
     }  
       
     
     int max=0;
     int secondMax=0;
     int thridMax=0;
     char res=' ';
     for(int i=0;i<count.length;i++) {
		
//		System.out.println(ch[i]);
    
    	 
    	 if(ch[i]!='0' && ch[i]!=' ') {
    		 System.out.println(ch[i]+""+count[i]); 
    		 if(max<count[i]) {
   			     thridMax = secondMax;//
    			 secondMax=max;
    			 max=count[i];	 
    			 
    		 }else if(count[i]>secondMax && max>count[i]){
    			
    			 thridMax=secondMax;
    			 secondMax=count[i];	 
    		 }
    		 else if(count[i]>thridMax && secondMax>count[i]) {
    			 thridMax=count[i];
    			 
    		 }
    		 
    		 
    		 
    	 }
     }
     
     System.out.println(max+"  "+secondMax+"  "+thridMax);
	}

}
