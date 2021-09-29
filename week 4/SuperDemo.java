class Box {
	private double width;
	private double height;
	private double length;

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

class BoxWeight extends Box {
	double weight;

	BoxWeight(){

		super();
		weight = 0;
	}

	BoxWeight(BoxWeight ob){

		super(ob);
		weight = ob.weight;
	}

	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}

	BoxWeight(double w, double d, double h, double m){
		super(w, d, h);
		//width = w;
		//length = d;
		//height = h;
		weight = m;
	}
}

class SuperDemo {

	public static void main(String[] args) {

		BoxWeight box01 = new BoxWeight(10,32,23,5);

		double vol = box01.volume();
		System.out.println("Box1 vol: " + vol);
		System.out.println("Box1 mass: " + box01.weight);

		BoxWeight box02 = new BoxWeight();

		vol = box02.volume();
		System.out.println("Box2 vol: " + vol);
		System.out.println("Box2 mass: " + box02.weight);
	}
}