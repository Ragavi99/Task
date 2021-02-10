package Task;

class Employee1
{
	String firstname;
	String lastname;
	
	public Employee1(String firstname, String lastname)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee1 [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
		Employee1 emp = new Employee1("tom","jerry");
		System.out.println(emp);

		
		
		

	}

}
