class  textfor1
{
	public static void main(String[] args) 
	{
		for (int i=101; i<200 ; i++ )
		{
			boolean f = true;
			for (int j=2; j<i; j=j+2)
			{
				if (0 == i % j)
				{
					f = false;
					break;

				}
			}
			if (!f)
			{
				continue;
			}
			System.out.println("i=" + i);
		}
	}
}
