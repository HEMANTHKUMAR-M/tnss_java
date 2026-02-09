package Basics;

class Animal{
	
	public void eat() {
		System.out.println("Eating,,,,");
	}
}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("Barking,,,,,");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.bark();

	}

}
