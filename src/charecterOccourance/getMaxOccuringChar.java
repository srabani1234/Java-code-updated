package charecterOccourance;

public class getMaxOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="perfect picturee";
		
		
		char[] ch = str.toCharArray();
		int[] count = new int[ch.length];
	
		for(int i=0;i<ch.length;i++) {
			
			count[i]=1;
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					count[i]++;
					
					ch[j]='0';
					
					
				}
				
			}
			
			
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
		int i=0;
		char res=' ';
		char rev=' ';
		int max=count[0];
		int min=count[0];
		for( i=0;i<ch.length-1;i++) {
			
			if(ch[i]!='0' && ch[i]!=' ') {
				
				System.out.println(ch[i]+"  "+count[i]);
				
				if(max<count[i]) {
					res=ch[i];
					max=count[i];
					
					
					//System.out.println("max:"+ch[i]+" "+max);
				}else if(min>count[i]) {
					
					min=count[i];
					rev=ch[i];
				}
			

				
			}
			
		}
		System.out.println("max:"+res+" "+max);
		System.out.println("min:"+rev+" "+min);
		System.out.println("max:"+max);

	}

}
