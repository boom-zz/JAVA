public class TextEquals
{
	public static void main(String[] args) 
	{
		Egg e1 = new Egg(1, 2, 3);
		Egg e2 = new Egg(1, 2, 3);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		
		String s1 = new String("Hi");
		String s2 = new String("Hi");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

class Egg
{
	int color;
	int weight;
	int height;

    public Egg(int color, int height, int weight)
    {
	    this.color = color;
	    this.height = height;
	    this.weight = weight;
    }

	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		else
			{
				if(obj instanceof Egg)
				{
					Egg e = (Egg)obj;
					if (e.color == this.color && e.height == this.height && e.weight == this.weight)
					{
						return true;
					}
				}
			}
		return false;
	}
}



