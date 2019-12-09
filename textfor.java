class  textfor
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i=1; i<=100 ; i++)
		{
			if (0 == i % 3)
			{
				System.out.println("i=" + i);
				sum =sum + 1;
				
			}
			if (sum>5)
			{
				break;			
			}
		}
		
	}
}
