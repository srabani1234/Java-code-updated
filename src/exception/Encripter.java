package exception;

public class Encripter implements iter {

	public int mi() {
		
		return 7;
	}
	
	public String getEncriptedNme(String name) {
		
		return name;
	}
	
	public void m1() {
		iter.super.m1();
		
	}
	public static void main (String[] args) {
	Encripter e=new Encripter();
	e.m1();
	int m=e.mi();
	System.out.print(m);
	}
}
