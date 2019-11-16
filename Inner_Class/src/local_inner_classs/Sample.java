package local_inner_classs;

/**
 * Simple Java program for Local Inner Class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class Local
{
	private int i=10;
	public void display()
	{
		class A
		{
			public void msg()
			{
				System.out.println("Hello:"+i);
			}
		}
		A a=new A();
		a.msg();
	}
}



public class Sample 
{
	public static void main(String args[])
	{
	Local l=new Local();
	l.display();
	}

}
