package Task;

class Employee extends Exception
{
	private String firstname;
	private String lastname;
	
	
	public Employee(String firstname, String lastname)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	public void checkException(String firstname,String lastname)
	{
		try
		{
			if(firstname.equals(" ") && lastname.equals(" "))
			{
				System.out.println("Entry missing");
			}
			else if(firstname.length()<3 && lastname.length()<3)
			{
				try
				{
					throw new NameException();
				}catch(NameException e)
				{
					System.out.println("name should be minimum 3 character");
				}
			}else
			{
				System.out.println("name:"+firstname+" "+lastname);

			}
		}catch(NullPointerException e)
		{
			System.out.println("entry missing");
		}
	}
	
	
}
public class Question3 {

	public static void main(String[] args) {
		Employee emp1=new Employee("shin", "chan");
		emp1.checkException("sh","ch");

	}

}
