class TextString 
{
	public static void main(String[] args) 
	{
		String s = "Aaf%fa AFF_dfd4624t";
		int lowcount = 0, upcount = 0, otcount=0;
		for (int i=0; i<s.length() ; i++)
		{
			char c = s.charAt(i);
			if (c >='a' && c<='z')
			{
				lowcount++;
			}
			else if (c>='A' && c<='Z')
			{
				upcount++;
			}
			else
			{
				otcount++;
			}
		}
		System.out.println(lowcount);
		System.out.println(upcount);
	}
}
