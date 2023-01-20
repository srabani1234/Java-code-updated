package employee.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("sra",300,"QA"));
		l.add(new Employee("adh",200,"QA"));
		l.add(new Employee("san",400,"DEV"));
		l.add(new Employee("akg",700,"DEV"));
		
		Comparator<Employee> c= (e1,e2)->e1.salary>e2.salary?1:e1.salary<e2.salary?-1:0;
		
		Collections.sort(l,c);
	List<Employee> l1=new ArrayList<Employee>();
	Predicate<Employee> p=(e)->e.depart=="QA";
	for(Employee e:l) {
	//	System.out.println(l);
		System.out.println(e);
		
		
	}
	////////////
/*	for(Employee e:l) {
		System.out.println(e);
		
		if(p.test(e)) {
			l1.add(e);
			System.out.println(l1);
		}
		
		
	}
	*/
	
	for(Employee e:l) {
      if(e.depart.equals("DEV")) {
    	
    	  l1.add(e);
		System.out.println(l1);
		
      }
	}
	

	}

}
