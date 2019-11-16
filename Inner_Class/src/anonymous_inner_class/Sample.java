package anonymous_inner_class;

/**
 * Simple Java program for Annonymous inner class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

abstract class Person
{
	abstract void eat();
}
public class Sample 
{
	public static void main(String[] args) 
	{
		Person s=new Person()
		{
			public void eat()
			{
				System.out.println("I like to eat graphs..");
			}
		};
		
		s.eat();
	}

}
