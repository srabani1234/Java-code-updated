package charecterOccourance;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		char re=' ';
		//String str = "aaabbb";
		String str= "aabb"; //5+1/2=3     a b a b a
		char ch[] = str.toCharArray();
		int[] count = new int[256];
		//initiallize the count array
		for(int i=0;i<ch.length;i++) {
			//count[str.charAt(i)]++;
			count[ch[i]]++;		
		}	
		for(int i=0;i<ch.length;i++) {
		int find=0;
			for(int j=0;j<=i;j++) {
				
				if(ch[i]==ch[j]) {
				 find++;
				
				}
			}
			if(find==1) {
				 System.out.println(
		                    "Number of Occurrence of "
		                    + str.charAt(i)
		                    + " is:" + count[str.charAt(i)]);		 
				 
			}
					
		}
			////////////////////aabb
		  int i=0;int j=str.length()-1;
		       if(count['a']==count['b']){
		         System.out.println(count['a']);
		                      while(i<j) {
			if(str.charAt(i)!='a' || str.charAt(j)!='b') {
				
				System.out.print(str.charAt(i)+""+str.charAt(j));
				
			}else if(str.charAt(i)!='b' || str.charAt(j)!='a') {
				
				System.out.print(str.charAt(i)+""+str.charAt(j));
			}
				
				i++;
				j--;
				
			}
		                    
		}
		  /////////////////////////////////// aabba-ababa
		      
	}
}
