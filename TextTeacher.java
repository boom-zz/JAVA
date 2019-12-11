class Person
{
	private String name;
	private String location;
	
	Person(String name)
	{
		this.name = name;
		this.location = "beijing";
	}
	Person(String name, String location)
	{
		this.name = name;
		this.location = location;
	}
	public String info()
	{
		return
			"name:"+name+
			"locationn:"+location;
	}
}

class Student extends Person
{
	private String school;
	
	Student(String name, String school)
	{
		this(name,"beijing",school);
	}
	Student(String n, String l, String school)
	{
		super(n,l);
		this.school = school;
	}
	public String info()
	{
		return
			super.info()+"school:"+school;
	}
}

class Teacher extends Person
{
	private String zhicheng;
	
	Teacher(String name, String zhicheng)
	{
		this(name,"beijing",zhicheng);
	}
	Teacher(String n, String l, String zhicheng)
	{
		super(n,l);
		this.zhicheng = zhicheng;
	}
	public String info()
	{
		return super.info() + "zhicheng:" + zhicheng;
	}
}

class TextTeacher
{
	public static void main(String[] args) 
	{
		Teacher tt1 = new Teacher("A","½ÌÊÚ");
		Teacher tt2 = new Teacher("A","shanghai","¸±½ÌÊÚ");
		System.out.println(tt1.info());
		System.out.println(tt2.info());
	}
}
