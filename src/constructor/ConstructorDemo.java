package constructor;

class User1
{
	String name;
	int age;
	
	User1()
	{
		name="Guest";
		age=23;
		System.out.println(name + " "+age);
	}
	User1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("User created : "+ name + age);
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		new User1();
		new User1("hema",26);

	}

}
