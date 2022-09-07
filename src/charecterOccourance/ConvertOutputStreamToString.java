package charecterOccourance;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ConvertOutputStreamToString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 // declaring ByteArrayOutputStream
        ByteArrayOutputStream stream
            = new ByteArrayOutputStream();
 
        // Initializing string
        String st = "Hello Geek!";
        System.out.println(st);
        // writing the specified byte to the output stream
        stream.write(st.getBytes());
 
        // converting stream to byte array
        // and typecasting into string
        String finalString
            = new String(stream.toByteArray());
 
        // printing the final string
        System.out.println(finalString);

	}

}
