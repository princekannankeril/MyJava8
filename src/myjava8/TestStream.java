package myjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import employee.Employee;

public class TestStream {
	public static void main(String Args[]) { 
	Employee[] arrayOfEmps = {
		    new Employee(1, "Jeff Bezos", 100000.0), 
		    new Employee(2, "Bill Gates", 200000.0), 
		    new Employee(3, "Mark Zuckerberg", 300000.0)
		};
	//Stream.of(arrayOfEmps);
	
	List<Employee> emplist = Arrays.asList(arrayOfEmps);
	emplist.stream().forEach(i -> System.out.println(i.getEmpId()));
	
//System.out.println("The emploess are " +arrayOfEmps.toString());
	}



}
