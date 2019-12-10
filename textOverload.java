class textOverload 
{
	void max(int a, int b)
	{
		System.out.println( a > b ? a : b);
	}
	
	void max(float a, float b)
	{
		System.out.println( a > b ? a : b);
	}

	void max(int a, int b, int c)
	{
		int d = 0;
		if (a>b)
		{
			d = a;
			if (c>d)
			{
				d=c;
			}
			else
				d = a;
		}
		else
		{
			d = b;
			if (c>d)
			{
				d=c;
			}
			else
				d = b;
		}
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		textOverload w = new textOverload();
		w.max(1, 3, 4);
	}
}
