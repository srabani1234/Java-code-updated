package exception;

public class TestThrow3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String s="hh";
			
			throw new UserDefinedException(s);
		}catch(UserDefinedException e) {
			System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(e.getMessage());  
			
		}

	}

}
