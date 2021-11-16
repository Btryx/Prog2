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

class BoxWeight extends Box {
	double weight;

	BoxWeight(){
		super();
		weight = 0;
	}

	BoxWeight(double w, double d, double h, double m){
		super(w, d, h);
		//width = w;
		//length = d;
		//height = h;
		weight = m;
	}
	BoxWeight(BoxWeight ob){
		super(ob);
		weight = ob.weight;
		
	}
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
	
}

class Shipment extends BoxWeight {

	double cost;

	Shipment(double w, double d, double h, double m, double c){
		super(w,d,h,m);
		cost = c;
	}

	Shipment(Shipment ob){
		super(ob);
		cost = ob.cost;
	}
	Shipment(){
		cost = 0;
	}
	Shipment(double len, double m, double c){
		super();
		cost = c;

	}

	
}

class BoxDemo2 {

	public static void main(String[] args) {

		

		Shipment shipment = new Shipment(10,21,10, 20,3000);
		Shipment shipment2 = new Shipment(10,21,10, 20,3000);
		double vol;

		vol = shipment.volume();

		System.out.println("\nShip1:");
		System.out.println(vol);
		System.out.println(shipment.cost);

		vol = shipment2.volume();

		System.out.println("\nShip2:");
		System.out.println(vol);
		System.out.println(shipment2.cost);

		System.out.println("\nShip3:");
		Shipment shipment3 = new Shipment(shipment2);
		System.out.println(shipment3.cost);
	}
}