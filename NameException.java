package Task;

public class NameException extends Exception  
{
		String msg;
		public NameException()
		{
			super();
		}
		public NameException(String msg)
		{
			super(msg);
			this.msg=msg;
			System.out.println("name exception should be check");
		}
}


