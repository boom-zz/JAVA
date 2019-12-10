public class TextAccess
{
}

class T 
{
	private int a = 0;
	int b = 0;
	protected int c = 0;
	public int d = 0;
}

class TT
{
	public void m()
		{
			T t = new T();
            System.out.println(t.b);//b,c,d可以访问，a不可以。
		}

}
