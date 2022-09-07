package charecterOccourance;
import java.util.*;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Main {
 public static void main(String[] args) {
  String str = "geek ht";
  String str1 = "geke ht";
  char ch[] = str.toLowerCase().replaceAll("\\s", "").toCharArray();
  char ch1[] =str1.toLowerCase().replaceAll("\\s", "").toCharArray();
  
  HashMap<Character,Integer> map= new HashMap<Character, Integer>();
  HashMap<Character,Integer> map1= new HashMap<Character, Integer>();
  
  if(str.length()==str1.length()) {
	  
	  for(char c:ch) {
		  
		  if(map.containsKey(c)) {
			  
			  map.put(c, map.get(c)+1);
			  System.out.println("jj"+c+""+map.get(c));
			  
		  }
		  else {
			  
			  map.put(c, 1);
		  }
		  
	  }
for(char cc:ch1) {
		  
		  if(map1.containsKey(cc)) {
			  
			  map1.put(cc, map1.get(cc)+1);
			  System.out.println(map.get(cc));
			  
		  }
		  else {
			  
			  map1.put(cc, 1);
		  }
		  
	  }
	  
	  
	  
  }else {
	  
	  System.out.println("lenght not matched");
  }
  System.out.println(map);
  System.out.println(map1);
  
  if(map.equals(map1)) {
  
  System.out.println("Anagram");

}
 else {
	 System.out.println("not Anagram");
	 
 }
 }
}

