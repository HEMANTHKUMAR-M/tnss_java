package Basics;

class Rectangle {
    double length;
    double breadth;
    double x, y;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Circle 
{
    double r;
    double x, y;

    double circumferance() {
        return 2 * 3.14 * r;
    }

    double area() {
        return 3.14 * r * r;
    }
}


public class MultipleClassDemo {

	public static void main(String[] args) {
	
		        Circle c = new Circle();

		        c.x = 0.0;
		        c.y = 1.0;
		        c.r = 10;

		        System.out.println("The Circumference of a circle: " + c.circumferance());
		        System.out.println("The Area of Circle: " + c.area());
		        
		        
		        Rectangle r = new Rectangle();
		        r.x = 0.0;
		        r.y = 0.0;
		        r.length = 10;
		        r.breadth = 5;

		        System.out.println("Area of Rectangle: " + r.area());
		        System.out.println("Perimeter of Rectangle: " + r.perimeter());
		    }
		


	}


