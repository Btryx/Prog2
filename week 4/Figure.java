abstract class Figure{

	double d1;
	double d2;

	Figure(double a, double b)
	{
		d1 = a;
		d2 = b;
	}

	abstract double area();
}

class Rectangle extends Figure{
	Rectangle(double a, double b)
	{
		super(a,b);
	}
	double area(){
		return d1 * d2;
	}
}

class Triangle extends Figure{

	Triangle(double a, double b){
		super(a, b);
	}

	double area(){
		return (d1*d2)/2;
	}
}

class Area{

public static void main(String[] args) {

	Triangle t1 = new Triangle(20,10);
	double triangleArea = t1.area();
	System.out.println("Háromszög area: " + triangleArea);

	Rectangle r1 = new Rectangle(30,24.6);
	double rectarea = r1.area();
	System.out.println("Rectangle area: " + rectarea);

	}
}