
package charecterOccourance;

public class charOccouranceWithoutHashMap2 {

	//take from geeksoft
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		char re=' ';
		String str = "perfect Picture";
		char ch[] = str.toCharArray();
		//// Create an array of size 256
        // i.e. ASCII_SIZE
		int[] count = new int[256];
		//initiallize the count array.// Count frequency of every character and store
        // it in counter array
		for(int i=0;i<ch.length;i++) {
			//count[str.charAt(i)]++; count['p']
			count[ch[i]]++;
			System.out.println("check:"+count[ch[i]]+"="+count[ch[i]]+"+"+1);
			System.out.println("st:"+ch[i]);
			System.out.println("count:"+count[ch[i]]);
		
		}
		for(int i=0;i<count.length;i++) {
			//count[str.charAt(i)]++;
			System.out.println("c"+count[i]);
		
		}
		
		for(int i=0;i<ch.length;i++) {
		int find=0;
			for(int j=0;j<=i;j++) {
				
				if(ch[i]==ch[j]) {
					//count[i]++;
					System.out.println("i:"+i+""+ch[i]);
					System.out.println("j:"+j+""+ch[j]);
				 find++;
					
					System.out.println("find"+find);

				}
			}
			if(find==1) {
				 System.out.println(
		                    "Number of Occurrence of "
		                    + str.charAt(i)
		                    + " is:" + count[str.charAt(i)]);
				 
				 if(max<count[str.charAt(i)]) 
				 {
				max=count[str.charAt(i)];
				re=str.charAt(i);
					 
				 }
			}
					
		}
		

		System.out.println(re+" :"+max);

	}

}
