class Box {
	double width;
	double height;
	double length;

	Box() {
		width = 0;
		height = 0;
		length = 0;
	}//default constructor

	Box(Box ob) {
		this.length = ob.length;
		this.height = ob.height;
		this.width = ob.width;
	}

	Box(double len) {
		length = width = height = len;
	} // kocka

	Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	double volume() {
		return width * height * length;
	}

	void setDim(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	void setDim(double len) {
		length = width = height = len;
	}
}

class BoxDemo {

	public static void main(String[] args) {

		Box myBox01 = new Box();

		myBox01.width = 10;
		myBox01.height = 20;
		myBox01.length = 30;

		double vol = myBox01.volume();

		System.out.println("Box1 Volume is "+ vol);

		Box myBox02 = new Box(myBox01);
		System.out.println("Box2 Volume is " + myBox02.volume());

		Box myBox03 = new Box(10);
		System.out.println("Box3 Volume is " + myBox03.volume());

		Box myBox04 = new Box(10, 20, 65);
		System.out.println("Box4 Volume is " + myBox04.volume());

		myBox04.setDim(10);
		System.out.println("Box4 Volume is " + myBox04.volume());

		myBox04.setDim(10,15,10);
		System.out.println("Box4 Volume is " + myBox04.volume());

	}
}