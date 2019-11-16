package static_nested_class;


/**
 * Simple Java program for Static Nested Class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


class A
{
	static String name="GK";
	static class B
	{
		 void msg()
		{
			System.out.println("Hi ..I'm "+name);
		}
	}
	
}





public class Sample 
{

	public static void main(String[] args) 
	{
		A.B ob=new A.B();
		ob.msg();

	}

}
