package Array;

public class ProgramToSortNumericArrayAndStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		 String[] my_array2 = {
		            "Java",  
		            "Python",
		            "PHP",
		            "C#",
		            "C Programming",
		            "C++"
		        };
		int temp=0;
		String temp1="";
		for(int i=0;i<my_array1.length;i++) {
			
			for(int j=i+1;j<my_array1.length;j++) {
				
				if(my_array1[i]>my_array1[j]) {
					
					temp=my_array1[i];
					my_array1[i]=my_array1[j];
					my_array1[j]=temp;
					
				}
				
				
			}
			
			System.out.println(my_array1[i]);
			//System.out.println(my_array1);
		}
		
		for(int i=0;i<my_array2.length;i++) {
			
			for(int j=i+1;j<my_array2.length;j++) {
				
				if(my_array2[i].compareTo(my_array2[j])>0 ) {
					
					temp1=my_array2[i];
					my_array2[i]=my_array2[j];
					my_array2[j]=temp1;
					
				}
				
				
			}
			
			System.out.println(my_array2[i]);
			//System.out.println(my_array1);
		}
		
	}

}
