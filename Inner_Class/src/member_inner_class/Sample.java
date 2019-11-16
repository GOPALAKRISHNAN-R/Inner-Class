package member_inner_class;

/**
 * Simple Java program for Member Inner Class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class OuterCls
{
	private int i=10;
	class InnerCls
	{
		
		public void msg()
		{
			System.out.println("Member inner class is used:"+i);
		}
	}
}

public class Sample 
{
	public static void main(String[] args) 
	{
		OuterCls ob=new OuterCls();
		OuterCls.InnerCls in=ob.new InnerCls();
		in.msg();
	}

}
