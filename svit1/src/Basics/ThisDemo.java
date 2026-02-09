package Basics;


class Person{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	public void displayDetails()
	{
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
}

public class ThisDemo {

	public static void main(String[] args) {
		 Person obj=new  Person();
		 obj.setName("Kumar");
		 obj.setAge(20);
		 obj.getName();
		 obj.getAge();
		 obj.displayDetails();
		 
		 obj.setName("Hemanth");
		 obj.setAge(30);
		 obj.getName();
		 obj.getAge();
		 obj.displayDetails();
		 
	}

}




