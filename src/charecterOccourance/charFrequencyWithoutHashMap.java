package charecterOccourance;
public class charFrequencyWithoutHashMap   
{  
     public static void main(String[] args) {  
        String str = "picture perfect";  
        int[] freq = new int[str.length()];  
       // int i, j;  
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        for(int i = 0; i <string.length; i++) {  
            freq[i] = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                    System.out.println(string[i]+""+string[j]+" "+freq[i]);  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                   // System.out.println(string[i]+""+string[j]+""+freq[i]);
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies"); 
        System.out.println(freq);
        for(int i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
        
        int arr[] = {9,8,6,5};
        
        System.out.println(arr);//[I@5e265ba4
        for(int i=0;i<arr.length;i++) {
        	
        	System.out.println(arr[i]);
        }
        
    }  
}  
