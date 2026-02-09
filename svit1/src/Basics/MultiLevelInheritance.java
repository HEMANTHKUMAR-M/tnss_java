package Basics;

class Shape{
	
	double r = 10.0;
	public void shape() {
		System.out.println("radius of Circle");
	}
	
}

class Areacircle extends Shape{
	
	public void Area() {
		System.out.println(" The Area of a Circle : " + 3.14*r*r);
	}
}

class circumferanceCircle extends Areacircle{
	
	public void Circum() {
		System.out.println(" Circumferance of s circle " + 2*3.14*r);
	}
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		circumferanceCircle c = new circumferanceCircle();
		
		c.shape();
		c.Area();
		c.Circum();
		

	}

}
