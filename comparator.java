import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 
class Employee
{ 
	int id; 
	String name, address; 

	 
	public Employee(int id, String name, 
							String address) 
	{ 
		this.id = id; 
		this.name = name; 
		this.address = address; 
	} 


	public String toString() 
	{ 
		return this.id + " " + this.name + 
						" " + this.address; 
	} 
} 

class Sortbyid implements Comparator<Employee> 
{ 
	public int compare(Employee a, Employee b) 
	{ 
		return a.id - b.id; 
	} 
} 

class Sortbyname implements Comparator<Employee> 
{ 
	public int compare(Employee a, Employee b) 
	{ 
		return a.name.compareTo(b.name); 
	} 
} 

class JavaComparator
{ 
	public static void main (String[] args) 
	{ 
		ArrayList<Employee> ar = new ArrayList<Employee>(); 
		ar.add(new Employee(1, "niha", "Bnglr")); 
		ar.add(new Employee(2, "himu", "Mysore")); 
		ar.add(new Employee(3, "kush", "Chennai")); 

		Collections.sort(ar, new Sortbyid()); 

		System.out.println("\nSorted by id"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 

		Collections.sort(ar, new Sortbyname()); 

		System.out.println("\nSorted by name"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
	} 
} 
