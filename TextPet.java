class Animal
{
	private String name;
	Animal(String name)
	{
		this.name =name;
	}

	public void enjoy()
	{
		System.out.println("½ÐÉù");
	}
}

class Cat extends Animal
{
	private String eyeColor;
	Cat(String n, String c)
	{
		super(n);
		eyeColor = c;
	}
	public void enjoy()
	{
		System.out.println("Ã¨½ÐÉù");
	}
}

class Dog extends Animal
{
	private String furColor;
	Dog(String n, String c)
	{
		super(n);
		furColor = c;
	}
	public void enjoy()
	{
		System.out.println("¹·½ÐÉù");
	}
}

class Lady
{
	private String name;
	private Animal pet;
	Lady(String name, Animal pet)
	{
		this.name = name;
		this.pet =pet;
	}
	public void mypetenjoy()
	{
		pet.enjoy();
	}
}

class TextPet
{
	public static void main(String[] args) 
	{
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","red");
		Lady l1 = new Lady("l1",c);
		Lady l2 = new Lady("l2",d);
		l1.mypetenjoy();
		l2.mypetenjoy();
	}
}
