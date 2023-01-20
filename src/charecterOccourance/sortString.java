package charecterOccourance;

import java.util.Arrays;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bgac";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(Character.compare(ch[i],ch[j])>0) {
				
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
			
		}
		}
		
   String st=	String.valueOf(ch);
   System.out.println(st);

	}

}
