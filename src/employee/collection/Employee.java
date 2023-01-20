package employee.collection;

public class Employee {
	
	String name;
	int salary;
	String depart;
	
	public Employee(String name,int salary,String depart) {
		this.name=name;
		this.salary=salary;
		this.depart=depart;
		
	}
	public String toString() {
		return this.name+" "+this.salary+" "+this.depart;
		
	}
	

}
